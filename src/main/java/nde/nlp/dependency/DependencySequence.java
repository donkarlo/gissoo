package nde.nlp.dependency;

import java.util.ArrayList;
import nde.nlp.semantic.SemanticComposit;

/**
 *
 * @author donkarlo
 */
public class DependencySequence extends SemanticComposit{
    private ArrayList<Dependency> dependencies;

    public DependencySequence(ArrayList<Dependency> dependencies) {
        this.dependencies = dependencies;
    }
    
    /**
     * 
     * @param d
     * @return 
     */
    public DependencySequence addDependency(Dependency d){
        this.dependencies.add(d);
        return this;
    }

    public ArrayList<Dependency> getDependencies() {
        return dependencies;
    }
    
    
}
