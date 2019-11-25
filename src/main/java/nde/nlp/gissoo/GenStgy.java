package nde.nlp.gissoo;

import nde.kb.kbs;
import nde.kb.Kb;
import java.util.ArrayList;
import java.util.Set;

/**
 * Sample sentences that it should produce. 
 * The smell of a smoke of a cigarette is like a beared smiling middle-aged man with curly hair
 * Death is like being invisible in sunset of repetitive desert when you circle around yourself
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
