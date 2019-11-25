package nde.nlp.dependency.svo;

import nde.nlp.semantic.SemanticUnit;
import nde.nlp.semantic.Entity;
import nde.nlp.semantic.SemanticComposit;

/**
 *
 * @author donkarlo
 */
public class Dependency extends nde.nlp.dependency.Dependency{
    private Entity subj;
    private String verb;
    private Entity obj;

    /**
     * 
     * @param subj
     * @param verb
     * @param obj 
     */
    public Dependency(Entity subj, String verb, Entity obj) {
        this.subj = subj;
        this.verb = verb;
        this.obj = obj;
    }
    
}
