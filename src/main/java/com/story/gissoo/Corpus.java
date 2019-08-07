package com.story.gissoo;

import java.util.ArrayList;

/**
 * It is Raw text corpus, if it is a corpus of trees. Then it willl be mention
 * in the beginning of class name. Each corpus will have just one source.
 *
 * @author Mohammad
 */
abstract public class Corpus extends Kb {

    /**
     * An option among what AV_ACCESS_TYPES offers to indicate what is the
     * nature of the source
     */
    protected KB_AV_ACCESS_TYPE accessType;
    /**
     * File path, in case accessType is FILE_PATH, in other cases it might
     * appear as a JSON string e.g. to present connection data to connect a
     * database
     */
    protected String accessDetail;

    /**
     * The in-app text, retrieved from the solution offered by accessType
     */
    public abstract String getString();

    abstract public ArrayList<String> getRandomSentences(int numSentences);

    /**
     *
     * @param accessType
     * @param accessDetail
     */
    public Corpus(KB_AV_ACCESS_TYPE accessType, String accessDetail) {

        this.accessType = accessType;
        this.accessDetail = accessDetail;
    }

    public KB_AV_ACCESS_TYPE getAccessType() {
        return accessType;
    }

    /**
     *
     * @return
     */
    public String getAccessDetail() {
        return accessDetail;
    }

}
