package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class RandomSentencesOfWordsFromCorpusGenStgy extends GenStgy {

    protected TextFileCorpus textFileCorpus;
    protected ArrayList<String> words = new ArrayList<>();

    public RandomSentencesOfWordsFromCorpusGenStgy(TextFileCorpus textFileCorpus, ArrayList<String> words) {
        super(textFileCorpus);
        this.textFileCorpus = textFileCorpus;
        this.words = words;
    }

    @Override
    public String getStringStory() {
        String sentencesString = "";
        for (String sentence : this.getSentences()) {
            sentencesString += sentence + ". ";
        }
        this.stringStory = sentencesString;
        return this.stringStory;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getSentences() {
        this.sentences = this.textFileCorpus.getRandomSentencesContainWords(this.words);
        return this.sentences;
    }
}
