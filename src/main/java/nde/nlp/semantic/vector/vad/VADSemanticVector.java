/*
 * 
 */
package nde.nlp.semantic.vector.vad;

import nde.math.linalg.Vector;
import nde.nlp.semantic.SemanticComposit;
import nde.nlp.semantic.vector.SemanticCompositVector;

/**
 *
 * @author donkarlo
 */
public class VADSemanticVector extends SemanticCompositVector{
    private double valence;
    private double arousal;
    private double dominance;

    public VADSemanticVector(SemanticComposit semanticVector, Vector vector, double valence, double arousal, double dominance) {
        super(semanticVector, vector);
        this.valence = valence;
        this.arousal = arousal;
        this.dominance = dominance;
    }
    
}
