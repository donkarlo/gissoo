package nde.nlp.dependency.antonym;

import nde.nlp.dependency.Dependency;
import nde.nlp.dependency.DependencySequence;
import java.util.ArrayList;

/**
 *
 * @author donkarlo
 */
public class SequenceAntonymRater {

    private DependencySequence ds;
    /**
     *
     */
    private ArrayList<SequenceAntonymRaterStructure> srss;

    public SequenceAntonymRater(DependencySequence ds) {
        this.ds = ds;
        this.srss = new ArrayList<SequenceAntonymRaterStructure>();
    }

    private ArrayList<SequenceAntonymRaterStructure> getSequenceAntonymRaterStructures() {

        for (Dependency d1 : ds.getDependencies()) {
            for (Dependency d2 : ds.getDependencies()) {
                DependencyPairAntonymRater par = new DependencyPairAntonymRater(d1, d2);
                SequenceAntonymRaterStructure srs = new SequenceAntonymRaterStructure(d1, d2, par.getAntonymRate(), 0);
                srss.add(srs);
            }
        }
        return null;
    }

    /**
     * Get overall rate by a strategy
     * @return
     */
    public double getRate() {

        return 0;
    }

}
