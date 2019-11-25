package nde.nlp.semantic;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Entities {

    private ArrayList<Entity> entities;

    private final static String[] AvCommonThemes = {"angry"};
    private ArrayList<String> CommonThemes = null;

    private final static String[] avGenSources = {"corpora"};
    private ArrayList<String> genSources = null;

    /**
     *
     * @return
     */
    public int getLength() {
        return entities.size();
    }
}
