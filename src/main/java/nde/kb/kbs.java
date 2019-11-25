package nde.kb;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class kbs {

    protected ArrayList<Kb> knowledgeBase = new ArrayList<>();

    public kbs add(Kb kb) {
        this.knowledgeBase.add(kb);
        return this;
    }

    public ArrayList<Kb> getKBs() {
        return knowledgeBase;
    }

}
