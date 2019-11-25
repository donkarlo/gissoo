package nde.nlp.gissoo.randomSentence;

import nde.nlp.corpus.TextFileCorpus;
import java.util.ArrayList;
import nde.nlp.gissoo.GenStgy;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class RandomSentencesOfWordsFromCorpusGenStgy extends GenStgy {

    protected TextFileCorpus textFileCorpus;
    protected ArrayList<String> words = new ArrayList<>();
    
    public RandomSentencesOfWordsFromCorpusGenStgy(TextFileCorpus textFileCorpus, ArrayList<String> words) {
        super(textFileCorpus);
        this.textFileCorpus = textFileCorpus;
        this.words = words;
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
        this.sentences = this.textFileCorpus.getRandomSentencesContainingWords(this.words);
        return this.sentences;
    }
}
