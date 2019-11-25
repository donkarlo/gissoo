/*
 * 
 */
package nde.nlp.semantic.vector.word2vec;

import java.util.ArrayList;
import nde.nlp.semantic.vector.classified.ClassifiedVectorSpace;
import nde.nlp.semantic.vector.SemanticCompositVector;
import nde.nlp.semantic.vector.classified.SemanticVectorClass;

/**
 *
 * @author donkarlo
 */
public class ClassifiedWord2Vec extends ClassifiedVectorSpace {

    public ClassifiedWord2Vec(ArrayList<SemanticVectorClass> semanticClasses) {
        super(semanticClasses);
    }

    @Override
    public SemanticVectorClass getNewClassAfterASemanticVectorCompositStep(SemanticCompositVector semanticVector) {
        return null;
    }
}
