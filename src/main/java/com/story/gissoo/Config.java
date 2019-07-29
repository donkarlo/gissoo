package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Config {
    
    private static Config inst = null;
    private TextFileCorpora textFileCorpora;
    private ArrayList<ConfigUnit> configUnits;
    
    private Config() {
        this.textFileCorpora = new TextFileCorpora();
        
        TextFileCorpus textFileCorpus = new CmuMoviePlotCorpus();
        this.textFileCorpora.addCorpus(textFileCorpus);
    }

    /**
     *
     * @return
     */
    public static Config getInst() {
        if (Config.inst == null) {
            Config.inst = new Config();
        }
        return Config.inst;
    }
    
    public TextFileCorpora getTextFileCorpora() {
        return textFileCorpora;
    }
    
}
