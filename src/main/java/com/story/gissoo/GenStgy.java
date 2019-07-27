package com.story.gissoo;

/**
 *
 * @author Mohammad Rahmani
 */
abstract public class GenStgy {

    protected KnowledgeBases knowledgeBases = new KnowledgeBases();
    protected String stringStory = null;

    abstract public String getStringStory();

    public GenStgy() {
    }

    public GenStgy(KnowledgeBase knowledgeBase) {
        this.knowledgeBases.add(knowledgeBase);
    }

    public GenStgy(KnowledgeBases knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
    }

}
