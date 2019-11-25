/*
 * To change this license header, choose License Headers in Project Properties.
 */
package nde.nlp.semantic.vector.vad;
import java.util.ArrayList;
import nde.nlp.semantic.vector.classified.ClassifiedVectorSpaceInterface;
import nde.nlp.semantic.vector.SemanticCompositVector;
import nde.nlp.semantic.vector.classified.SemanticVectorClass;

/**
 * After each semanticCompostVectorStep the size of the classes expands or condences
 * @author donkarlo
 */
public class VADClassifiedVectorSpace implements ClassifiedVectorSpaceInterface{
    private ArrayList<VADSemanticVectorClass> vadSemanticClasses;
    public VADClassifiedVectorSpace(ArrayList<VADSemanticVectorClass> vadSemanticClasses) {
        this.vadSemanticClasses = vadSemanticClasses;
    }

    @Override
    public SemanticVectorClass getNewClassAfterASemanticVectorCompositStep(SemanticCompositVector semanticVector) {
        return null;
    }
    
}
