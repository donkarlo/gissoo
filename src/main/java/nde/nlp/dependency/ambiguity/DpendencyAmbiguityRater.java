/*
 * 
 */
package nde.nlp.dependency.ambiguity;

import nde.nlp.dependency.svo.Dependency;
import nde.nlp.dependency.DependencyVector;

/**
 *
 * @author donkarlo
 */
public class DpendencyAmbiguityRater {

    private DependencyVector de;
    private EmbeddingClustering ec;

    public DpendencyAmbiguityRater(DependencyVector de, EmbeddingClustering ec) {
        this.de = de;
        this.ec = ec;
    }

}
