package com.story.gissoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class TextFileCorpus extends Corpus {

    public TextFileCorpus(String idAccessType, String AccessDetail) {
        super("FILE_PATH", AccessDetail);
    }

    public String getString() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(this.accessDetail));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
        return null;
    }

    public ArrayList<String> getRandomSentences(int sentencesNum) {
        ArrayList<String> sentences = new ArrayList<String>();
        try {
            File file = new File(this.accessDetail);
            int numOfCorpusSentences = this.getNumOfSentences();
            int[] randomSentenceIndexesInTheCorpus = new int[sentencesNum];
            randomSentenceIndexesInTheCorpus = this.uniqueRandInt(sentencesNum, numOfCorpusSentences);
            Scanner scanner = new Scanner(file);
            Pattern p = Pattern.compile("[\\.\\!\\?\\]]");
            scanner.useDelimiter(p);

            int corpusSentenceCounter = 0;
            while (scanner.hasNext()) {
                String newSentence = scanner.next().trim();
                if (intContains(randomSentenceIndexesInTheCorpus, corpusSentenceCounter)) {
                    sentences.add(newSentence);
                    if (sentences.size() >= sentencesNum) {
                        break;
                    }
                }
                corpusSentenceCounter++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileCorpus.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sentences;
    }

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
