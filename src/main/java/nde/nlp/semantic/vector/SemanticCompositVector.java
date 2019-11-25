/*
 * 
 */
package nde.nlp.semantic.vector;

import nde.math.linalg.Vector;
import nde.nlp.semantic.SemanticComposit;

/**
 *
 * @author donkarlo
 */
public class SemanticCompositVector {
    private SemanticComposit semanticComposit;
    private Vector vector;

    public SemanticCompositVector(SemanticComposit semanticComposit, Vector vector) {
        this.semanticComposit = semanticComposit;
        this.vector = vector;
    }
    
}
