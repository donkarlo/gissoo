package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Sentence extends KbPiece {

    protected String stringSentence;

    /**
     *
     * @param stringSentence
     */
    public Sentence(String stringSentence) {
        this.stringSentence = stringSentence;
    }

    /**
     *
     * @return
     */
    public String getStringSentence() {
        return stringSentence;
    }

    public String getSmallestMeaningfulPartContainingWord(String word) {
        return null;
    }

    public ArrayList<String> getClauses() {
        return null;
    }

    public ArrayList<String> getIndependentClauses() {
        return null;
    }

    public ArrayList<String> getDependentClauses() {
        return null;
    }

}
