package com.story.gissoo;

import java.util.ArrayList;

/**
 * Each corpus will have just one source
 * @author Mohammad
 */
abstract public class Corpus extends KnowledgeBase {

    /**
     * Available ID_TYPES
     */
    private static final String[] AV_ID_TYPES = {"FILE_PATH", "INPUT", "RDBMS"};

    public static String[] getAV_ID_TYPES() {
        return AV_ID_TYPES;
    }

    /**
     * An option among what AV_ID_TYPES offers to indicate what is the nature of
     * the source
     */
    protected String idAccessType;
    /**
     * File path, in case idAccessType is FILE_PATH, in other cases it might
     * appear as a JSON string e.g. to present connection data to connect a
     * database
     */
    protected String accessDetail;

    /**
     * The in-app text, retrieved from the solution offered by idAccessType
     */
    
    public abstract String getString () throws Exception;

    /**
     *
     * @param idType
     * @param detail
     */
    public Corpus(String idType, String detail) {

        boolean avIdTypeExists = false;
        for (String avIdType : Corpus.AV_ID_TYPES) {
            if (idType == avIdType) {
                avIdTypeExists = true;
                this.idAccessType = idType;
                this.accessDetail = detail;
                break;
            }
        }
        if (avIdTypeExists == false) {
            System.out.println("No known source type found");
        }
    }
    public String getIdAccessType() {
        return idAccessType;
    }
    /**
     * 
     * @return 
     */
    public String getAccessDetail() {
        return accessDetail;
    }
    
    public ArrayList<HumanSentence> getRandomHumanSentences(int num, int avrLen) {
        return null;
    }

}
