package nde.nlp.corpus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import nde.kb.KB_AV_ACCESS_TYPE;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class TextFileCorpus extends Corpus {

    /**
     *
     * @param accessType
     * @param accessDetail
     */
    public TextFileCorpus(KB_AV_ACCESS_TYPE accessType, String accessDetail) {
        super(accessType, accessDetail);
    }

    /**
     * Get the who file content in a single string
     * @return
     */
    public String getString() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.accessDetail));
            String line = null;
            StringBuilder stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            reader.close();
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     *
     * @param sampleSize
     * @return
     */
    public ArrayList<String> getRandomSentences(int sampleSize) {
        ArrayList<String> generatedSentences = new ArrayList<String>();
        try {
            File file = new File(this.accessDetail);
            int numOfCorpusSentences = this.getNumOfSentences();
            int[] randomSentenceIndexesInTheCorpus = new int[sampleSize];
            randomSentenceIndexesInTheCorpus = this.uniqueRandInt(sampleSize, numOfCorpusSentences);
            Scanner scanner = new Scanner(file);
            Pattern p = Pattern.compile("[\\.\\!\\?\\]]");
            scanner.useDelimiter(p);

            int corpusSentenceCounter = 0;
            while (scanner.hasNext()) {
                String newSentence = scanner.next().trim();
                if (this.intContains(randomSentenceIndexesInTheCorpus, corpusSentenceCounter)) {
                    generatedSentences.add(newSentence);
                    if (generatedSentences.size() >= sampleSize) {
                        break;
                    }
                }
                corpusSentenceCounter++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileCorpus.class.getName()).log(Level.SEVERE, null, ex);
        }

        return generatedSentences;
    }

    /**
     * Return random sentences containing given words.
     *
     * @param inputWords
     * @return
     */
    public ArrayList<String> getRandomSentencesContainingWords(ArrayList<String> inputWords) {
        ArrayList<String> selectedSentences = new ArrayList<String>();

        int stepSentenceSampleSize = inputWords.size();
        int sentenceSizeOfCorpus = this.getNumOfSentences();
        ArrayList<String> foundedWords = new ArrayList<>();
        do {
            //Prevent to seach in more than avalaible sentences in the corpus
            ArrayList<String> newSampleSentences = this.getRandomSentences(stepSentenceSampleSize);
            for (String sampleSentence : newSampleSentences) {
                for (String inputWord : inputWords) {
                    if (sampleSentence.toLowerCase().matches(".*\\b" + inputWord.toLowerCase() + "\\b.*")) {
                        if (!foundedWords.contains(inputWord)) {
                            foundedWords.add(inputWord);
                            selectedSentences.add(sampleSentence);
                            break;
                        }
                    }
                }
                if (foundedWords.size() >= inputWords.size()) {
                    break;
                }
            }
            //little by little make the sample size bigger
            stepSentenceSampleSize += stepSentenceSampleSize;
        } while ((foundedWords.size() < inputWords.size()) && (stepSentenceSampleSize < sentenceSizeOfCorpus));
        return selectedSentences;
    }

    /**
     * Return random sentences containing given words.
     *
     * @param words
     * @return
     */
    public ArrayList<String> getAllSentencesContainingWords(ArrayList<String> words) {
        int countWords = words.size();
        ArrayList<String> selectedSentences = new ArrayList<String>();

        int sentenceSizeOfCorpus = this.getNumOfSentences();
        //Prevent to seach in more than avalaible sentences in the corpus
        ArrayList<String> newSentences = this.getRandomSentences(500000);// 500000 takes 16 minutes
        for (String sentence : newSentences) {
            for (String word : words) {
                if (sentence.toLowerCase().matches(".*\\b" + word.toLowerCase() + "\\b.*")) {
                    selectedSentences.add(sentence);
                }
            }
        }
        return selectedSentences;
    }

    public ArrayList<String> getSimilarSentences() {
        return null;
    }

    /**
     *
     * @return
     */
    public int getNumOfSentences() {
        int sentenceCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.accessDetail));
            String line;
            String delimiters = "?!.";

            while ((line = reader.readLine()) != null) { // Continue reading until end of file is reached
                for (int i = 0; i < line.length(); i++) {
                    if (delimiters.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
                        sentenceCount++;
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sentenceCount;
    }

    /**
     * Generate n integers from 0 to upperbound
     *
     * @param numberOfRandomIntegers
     * @param upperBound
     * @return
     */
    private int[] uniqueRandInt(int numberOfRandomIntegers, int upperBound) {
        int[] its = new int[numberOfRandomIntegers];
        Random r = new Random();
        int counter = 0;
        while (counter < numberOfRandomIntegers) {
            int newRandomCandidate = r.nextInt(upperBound) + 1;
            if (!this.intContains(its, newRandomCandidate)) {
                its[counter] = newRandomCandidate;
                counter++;
            }
        }
        return its;
    }

    /**
     * If the array contains an int
     *
     * @param ints
     * @param target
     * @return
     */
    private boolean intContains(int[] ints, int target) {
        boolean contains = false;
        if (ints.length > 0) {
            for (int cont : ints) {
                if (cont == target) {
                    contains = true;
                    break;
                }
            }
        }
        return contains;
    }

}
