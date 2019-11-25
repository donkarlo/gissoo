package nde.nlp.dependency.antonym;

import nde.nlp.dependency.Dependency;

/**
 *
 * @author donkarlo
 */
public class DependencyPairAntonymRater {

    private Dependency depedncy1;
    private Dependency depedncy2;

    public DependencyPairAntonymRater(Dependency depedncy1, Dependency depedncy2) {
        this.depedncy1 = depedncy1;
        this.depedncy2 = depedncy2;
    }

    public double getAntonymRate() {
        return 0;
    }

}
