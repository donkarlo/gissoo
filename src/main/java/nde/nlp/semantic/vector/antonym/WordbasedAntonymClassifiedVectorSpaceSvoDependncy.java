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
public class WordbasedAntonymClassifiedVectorSpaceSvoDependncy extends ClassifiedVectorSpace implements ClassifiedVectorSpaceInterface {

    public WordbasedAntonymClassifiedVectorSpaceSvoDependncy(ArrayList<SemanticVectorClass> semanticClasses) {
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
    
    /**
     * 
     * @param currentSemanticVectorClass
     * @param svoDependencyVector
     * @return 
     */
    public SemanticVectorClass getNewClassAfterASemanticCompositStep(SemanticVectorClass currentSemanticVectorClass, nde.nlp.dependency.svo.SemanticCompositVector svoDependencyVector) {
        return null;
    }
}
