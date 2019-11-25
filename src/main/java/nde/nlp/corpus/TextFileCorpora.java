package nde.nlp.corpus;

import java.util.ArrayList;
import nde.nlp.semantic.HumanSentence;
import nde.kb.kbs;

/**
 * To deal with and array of LangCorpus
 *
 * @author Mohammad Rahmani
 */
public class TextFileCorpora extends kbs{

    /**
     * The array of existing corpus
     */
    private ArrayList<TextFileCorpus> corpusArray = new ArrayList<>();

    public TextFileCorpora() {
    }

    /**
     *
     * @param corpusArray
     */
    public TextFileCorpora(ArrayList<TextFileCorpus> corpusArray) {
        this.corpusArray = corpusArray;
    }

    /**
     * Add a new corpus to existing corpus
     *
     * @param corpus
     */
    public void addCorpus(TextFileCorpus corpus) {
        this.corpusArray.add(corpus);
    }

    /**
     * Get the list of existing corpus
     *
     * @return
     */
    public ArrayList<TextFileCorpus> getCorpusArray() {
        return this.corpusArray;
    }

    public ArrayList<HumanSentence> getRandomHumanSentences(int num, int avrLen) {
        return null;
    }

}
