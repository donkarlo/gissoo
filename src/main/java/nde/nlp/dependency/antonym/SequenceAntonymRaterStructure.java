package nde.nlp.dependency.antonym;

import nde.nlp.dependency.Dependency;

/**
 *
 * @author donkarlo
 */
public class SequenceAntonymRaterStructure {

    private Dependency ds1;
    private Dependency ds2;
    private double antonymRate;
    private int distance;

    public SequenceAntonymRaterStructure(Dependency ds1, Dependency ds2, double antonymRate, int distance) {
        this.ds1 = ds1;
        this.ds2 = ds2;
        this.antonymRate = antonymRate;
        this.distance = distance;
    }

}
