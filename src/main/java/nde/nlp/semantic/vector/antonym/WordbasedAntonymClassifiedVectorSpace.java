package nde.nlp.semantic.vector.antonym;

import java.util.ArrayList;
import nde.nlp.semantic.vector.classified.ClassifiedVectorSpace;
import nde.nlp.semantic.vector.classified.ClassifiedVectorSpaceInterface;
import nde.nlp.semantic.vector.SemanticCompositVector;
import nde.nlp.semantic.vector.classified.SemanticVectorClass;

/**
 * A word embedding clustering that puts antonym dependencies in different
 * classes
 *
 * @author donkarlo
 */
public class WordbasedAntonymClassifiedVectorSpace extends ClassifiedVectorSpace implements ClassifiedVectorSpaceInterface {

    public WordbasedAntonymClassifiedVectorSpace(ArrayList<SemanticVectorClass> semanticClasses) {
        super(semanticClasses);
    }

    /**
     * 
     * @param semanticVector
     * @return 
     */
    @Override
    public SemanticVectorClass getNewClassAfterASemanticVectorCompositStep(SemanticCompositVector semanticVector) {
        return null;
    }
}
