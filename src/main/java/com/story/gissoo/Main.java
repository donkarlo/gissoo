package com.story.gissoo;

import java.util.ArrayList;

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
                    words.add("window");
                    words.add("lamppost");
                    words.add("night");
                    words.add("wind");
                    words.add("alone");
                    words.add("winter");
                    Main.genStgy = new RandomSentencesOfWordsFromCorpusGenStgy(onlyCorpus, words);
                }
            }
        }
        Main.genStgy.printlnSentences();
    }
}