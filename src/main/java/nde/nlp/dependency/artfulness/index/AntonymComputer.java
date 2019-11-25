package nde.nlp.dependency.artfulness.index;

import nde.nlp.dependency.DependencySequence;
import nde.nlp.dependency.artfulness.ArtfullnessComputer;
import nde.nlp.dependency.artfulness.ArtfulnessComputerInterface;

/** 
 * @author donkarlo
 */
public class AntonymComputer extends ArtfullnessComputer implements ArtfulnessComputerInterface{

    /**
     * 
     * @param ds 
     */
    public AntonymComputer(DependencySequence ds) {
        super(ds);
    }
    
    
    /**
     * 
     * @return 
     */
    @Override
    public double getArtfulnessValue() {
        return 0;
    }
}
