package nde.nlp.dependency.artfulness.index;

import nde.nlp.dependency.DependencySequence;
import nde.nlp.dependency.artfulness.ArtfullnessComputer;
import nde.nlp.dependency.artfulness.ArtfulnessComputerInterface;

/**
 * Valence, Arousal and Dominance is so high that no more verbs can change the
 * semantic class
 *
 * @author donkarlo
 */
public class VadGravityComputer extends ArtfullnessComputer implements ArtfulnessComputerInterface {

    public VadGravityComputer(DependencySequence ds) {
        super(ds);
    }

    @Override
    public double getArtfulnessValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
