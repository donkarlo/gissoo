package nde.nlp.semantic;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class SimpleSentence {

    protected String subject;
    protected String verb;
    protected String object;

    /**
     * 
     */
    public SimpleSentence() {
    }

    /**
     * 
     * @param subject
     * @param verb 
     */
    public SimpleSentence(String subject, String verb) {
        this.subject = subject;
        this.verb = verb;
    }

    /**
     * 
     * @param subject
     * @param verb
     * @param object 
     */
    public SimpleSentence(String subject, String verb, String object) {
        this.subject = subject;
        this.verb = verb;
        this.object = object;
    }

}
