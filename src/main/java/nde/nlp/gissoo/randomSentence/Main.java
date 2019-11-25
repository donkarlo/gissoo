package nde.nlp.gissoo.randomSentence;

import nde.nlp.gissoo.randomSentence.Config;
import nde.kb.KB_AV_ACCESS_TYPE;
import nde.nlp.corpus.TextFileCorpus;
import java.util.ArrayList;
import nde.nlp.gissoo.GenStgy;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Main {

    private static GenStgy genStgy = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (Main.genStgy == null) {
            int crpSz = Config.getInst().getTextFileCorpora().getCorpusArray().size();
            if (crpSz == 1) {
                TextFileCorpus onlyCorpus = Config.getInst().getTextFileCorpora().getCorpusArray().get(0);
                if (onlyCorpus.getAccessType() == KB_AV_ACCESS_TYPE.FILE_PATH) {
//                    Main.genStgy = new RandomSentencesFromCorpusGenStgy(onlyCorpus, 10);
                    ArrayList<String> words = new ArrayList<String>();
                    words.add("toy");
                    words.add("car");
                    words.add("bus");
                    words.add("bicycle");
                    Main.genStgy = new RandomSentencesOfWordsFromCorpusGenStgy(onlyCorpus, words);
                }
            }
        }
        Main.genStgy.printlnSentences();
    }
}