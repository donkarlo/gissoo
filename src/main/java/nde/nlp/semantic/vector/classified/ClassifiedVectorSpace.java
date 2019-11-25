/*
 * 
 */
package nde.nlp.semantic.vector.classified;

import nde.nlp.semantic.vector.classified.ClassifiedVectorSpaceInterface;
import nde.nlp.semantic.vector.classified.SemanticVectorClass;
import java.util.ArrayList;

/**
 *
 * @author donkarlo
 */
abstract public class ClassifiedVectorSpace implements ClassifiedVectorSpaceInterface{

    private ArrayList<SemanticVectorClass> semanticVectorClasses;

    /**
     * 
     * @param semanticVectorClasses 
     */
    public ClassifiedVectorSpace(ArrayList<SemanticVectorClass> semanticVectorClasses) {
        this.semanticVectorClasses = semanticVectorClasses;
    }
    

}
