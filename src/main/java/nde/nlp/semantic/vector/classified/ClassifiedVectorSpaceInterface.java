/*
 * 
 */
package nde.nlp.semantic.vector.classified;

import nde.nlp.semantic.vector.SemanticCompositVector;

/**
 *
 * @author donkarlo
 */
public interface ClassifiedVectorSpaceInterface {

   /**
     * 
     * @param semanticVector 
     * @return 
     */
    public SemanticVectorClass getNewClassAfterASemanticVectorCompositStep(SemanticCompositVector semanticVector);
}
