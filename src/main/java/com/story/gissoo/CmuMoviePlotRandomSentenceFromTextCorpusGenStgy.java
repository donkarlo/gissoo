package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class CmuMoviePlotRandomSentenceFromTextCorpusGenStgy extends GenStgy {

    private ArrayList<String> sentences = null;
    private TextFileCorpus textFileCorpus;
    private int sampleSize;

    public CmuMoviePlotRandomSentenceFromTextCorpusGenStgy(TextFileCorpus textFileCorpus, int sampleSize) {
        super(textFileCorpus);
        this.textFileCorpus = textFileCorpus;
        this.sampleSize = sampleSize;
    }

    @Override
    public String getStringStory() {
        String sentencesString = "";
        for (String sentence : this.getSentecncesArrayStory()) {
            sentencesString += sentence + '.';
        }
        this.stringStory = sentencesString;
        return this.stringStory;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getSentecncesArrayStory() {
        this.sentences = this.textFileCorpus.getRandomSentences(this.sampleSize);
        ArrayList<String> pureSentences = new ArrayList<String>();

        for (String asentence : this.sentences) {
            String[] splited = asentence.split("\t");
            if (splited.length == 2) {
                pureSentences.add(splited[1]);
            } else {
                pureSentences.add(splited[0]);
            }
        }
        this.sentences = pureSentences;
        return this.sentences;
    }
}
