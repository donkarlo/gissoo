/**
 * 
 */
package nde.nlp.semantic.vector;

import nde.nlp.corpus.Corpora;

/**
 *
 * @author donkarlo
 */
public class VectorSpaceBuilder {
    private Corpora corpora;
    private EmbeddingStrgyInterface embeddingStrgy;
    

    /**
     * 
     * @param corpora
     * @param embeddingStrgy 
     */
    public VectorSpaceBuilder(Corpora corpora, EmbeddingStrgyInterface embeddingStrgy) {
        this.corpora = corpora;
        this.embeddingStrgy = embeddingStrgy;
    }

}
