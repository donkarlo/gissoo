package nde.nlp.gissoo;

import nde.nlp.semantic.Event;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Character {
    protected String id;
    protected String fname;
    protected String lname;
    protected String popularName;
    /**
     * The character has so far "RAN" from here to there in t time and picked an apple. 
     */
    protected ArrayList<Event> commitedEventsSoFar;
}
