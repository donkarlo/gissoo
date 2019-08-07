package com.story.gissoo;

import java.util.ArrayList;

/**
 * To deal with and array of LangCorpus
 *
 * @author Mohammad Rahmani
 */
public class Corpora extends kbs{

    /**
     * The array of existing corpus
     */
    private ArrayList<Corpus> corpusArray = new ArrayList<>();

    public Corpora() {
    }

    /**
     *
     * @param corpusArray
     */
    public Corpora(ArrayList<Corpus> corpusArray) {
        this.corpusArray = corpusArray;
    }

    /**
     * Add a new corpus to existing corpus
     *
     * @param corpus
     */
    public void addCorpus(Corpus corpus) {
        this.corpusArray.add(corpus);
    }

    /**
     * Get the list of existing corpus
     *
     * @return
     */
    public ArrayList<Corpus> getCorpusArray() {
        return this.corpusArray;
    }

    public ArrayList<HumanSentence> getRandomHumanSentences(int num, int avrLen) {
        return null;
    }

}
