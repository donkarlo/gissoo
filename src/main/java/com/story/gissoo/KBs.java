package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class KBs {

    protected ArrayList<KB> knowledgeBase = new ArrayList<>();

    public KBs add(KB kb) {
        this.knowledgeBase.add(kb);
        return this;
    }

    public ArrayList<KB> getKBs() {
        return knowledgeBase;
    }

}
