package nde.nlp.gissoo.randomSentence;

import nde.nlp.corpus.TextFileCorpus;
import java.util.ArrayList;
import nde.nlp.gissoo.GenStgy;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class RandomSentencesFromCorpusGenStgy extends GenStgy {

    private TextFileCorpus textFileCorpus;
    private int sampleSize;

    public RandomSentencesFromCorpusGenStgy(TextFileCorpus textFileCorpus, int sampleSize) {
        super(textFileCorpus);
        this.textFileCorpus = textFileCorpus;
        this.sampleSize = sampleSize;
    }

    @Override
    public String getStringStory() {
        String sentencesString = "";
        for (String sentence : this.getSentences()) {
            sentencesString += sentence + ". ";
        }
        this.stringStory = sentencesString;
        return this.stringStory;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getSentences() {
        this.sentences = this.textFileCorpus.getRandomSentences(this.sampleSize);
        return this.sentences;
    }
}
