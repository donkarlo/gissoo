/*
 * 
 */
package nde.nlp.semantic.vector;

import java.util.ArrayList;
import nde.nlp.semantic.SemanticComposit;

/**
 *
 * @author donkarlo
 */
public class SemanticVectorSpace {

    private ArrayList<SemanticComposit> semanticComposits;

    public SemanticVectorSpace(ArrayList<SemanticComposit> semanticComposits) {
        this.semanticComposits = semanticComposits;
    }
}
