package nde.nlp.gissoo;

import nde.kb.KB_AV_ACCESS_TYPE;
import nde.nlp.corpus.TextFileCorpus;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class CmuMoviePlotCorpus extends TextFileCorpus {

    public CmuMoviePlotCorpus() {
        super(KB_AV_ACCESS_TYPE.FILE_PATH, "data/corpora/cmu-movie-summary-corpus-plot-summaries.txt");
    }

    /**
     *
     * @param sampleSize
     * @return
     */
    public ArrayList<String> getRandomSentences(int sampleSize) {
        ArrayList<String> sentences = super.getRandomSentences(sampleSize);
        ArrayList<String> pureSentences = new ArrayList<String>();

        for (String asentence : sentences) {
            String[] splited = asentence.split("\t");
            if (splited.length == 2) {
                pureSentences.add(splited[1]);
            } else {
                pureSentences.add(splited[0]);
            }
        }
        sentences = pureSentences;
        return sentences;
    }

}
