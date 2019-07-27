package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class KnowledgeBases {

    protected ArrayList<KnowledgeBase> knowledgeBase = new ArrayList<>();

    public KnowledgeBases add(KnowledgeBase kb) {
        this.knowledgeBase.add(kb);
        return this;
    }

    public ArrayList<KnowledgeBase> getKnowledgeBase() {
        return knowledgeBase;
    }
    
    
}
