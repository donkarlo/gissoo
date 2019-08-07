package com.story.gissoo;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Mohammad Rahmani
 */
abstract public class GenStgy<Plan> {

    protected kbs kb = new kbs();
    protected String stringStory = null;
    protected ArrayList<Plan> plans;
    protected Set<Character> characters;
    /**
     * Successive sentences of the final generated story.
     */
    protected ArrayList<String> sentences = null;

    abstract public String getStringStory();

    abstract public ArrayList<String> getSentences();

    public GenStgy() {
    }

    public GenStgy(Kb kb) {
        this.kb.add(kb);
    }

    public GenStgy(kbs kbs) {
        this.kb = kbs;
    }

    public kbs getKb() {
        return this.kb;
    }

    public void printlnSentences() {
        for (String sentence : this.getSentences()) {
            System.out.println(sentence);
        }
    }

}
