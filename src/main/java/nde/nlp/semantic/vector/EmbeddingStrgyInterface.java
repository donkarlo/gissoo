/*
 */
package nde.nlp.semantic.vector;

import nde.math.linalg.Vector;
import nde.nlp.semantic.SemanticComposit;

/**
 *
 * @author donkarlo
 */
public interface EmbeddingStrgyInterface {
    public Vector getVector(SemanticComposit semantic);
}
