package nde.nlp.semantic;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Sentences extends SemanticComposit{

    protected ArrayList<Sentence> sentences = new ArrayList<Sentence>();

    public Sentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    public ArrayList<String> smallestMeaningfulPartContainingWord(String word) {
        return null;
    }

}
