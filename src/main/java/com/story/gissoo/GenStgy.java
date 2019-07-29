package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani
 */
abstract public class GenStgy {

    protected KBs knowledgeBases = new KBs();
    protected String stringStory = null;
    /**
     * Successive sentences of the final generated story.
     */
    protected ArrayList<String> sentences = null;

    abstract public String getStringStory();

    abstract public ArrayList<String> getSentences();

    public GenStgy() {
    }

    public GenStgy(KB knowledgeBase) {
        this.knowledgeBases.add(knowledgeBase);
    }

    public GenStgy(KBs knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
    }

    public KBs getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public void printlnSentences() {
        for (String sentence : this.getSentences()) {
            System.out.println(sentence);
        }
    }

}
