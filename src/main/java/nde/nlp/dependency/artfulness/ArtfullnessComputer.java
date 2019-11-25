package nde.nlp.dependency.artfulness;
import nde.nlp.dependency.DependencySequence;
/**
 *
 * @author donkarlo
 */
abstract public class ArtfullnessComputer {
    protected double artfulnessValue;
    private DependencySequence ds;

    /**
     * 
     * @param ds 
     */
    public ArtfullnessComputer(DependencySequence ds) {
        this.ds = ds;
    }
    
}
