package com.story.gissoo;

import java.util.Scanner;

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
                if (onlyCorpus.getIdAccessType() == "FILE_PATH") {
                    Main.genStgy = new CmuMoviePlotRandomSentenceFromTextCorpusGenStgy(onlyCorpus, 3);
                }
            }
        }
        System.out.println(Main.genStgy.getStringStory());
    }
}
