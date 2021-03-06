package nde.nlp.corenlp;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
//import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
//import edu.stanford.nlp.ling.CoreLabel;
//import edu.stanford.nlp.pipeline.Annotation;
//import edu.stanford.nlp.pipeline.StanfordCoreNLP;
//import edu.stanford.nlp.util.CoreMap;

public class StandfordCoreNlpSimpleTest {

    public static void main(String[] args) {

//        // Get current size of heap in bytes
//        long heapSize = Runtime.getRuntime().totalMemory();
//
//// Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
//        long heapMaxSize = Runtime.getRuntime().maxMemory();
//
//        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
//        long heapFreeSize = Runtime.getRuntime().freeMemory();
//        
//        System.out.println(heapSize);
//        System.out.println(heapMaxSize);
//        System.out.println(heapFreeSize);
//        // creates a StanfordCoreNLP object, with POS tagging, lemmatization,
//        // NER, parsing, and coreference resolution
//        Properties props = new Properties();
//        //ner and dcoref are temporarility removed from this list 
////        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
//        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner");
//        props.put("ner.useSUTime", "false");
//
//        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//
//        // read some text in the text variable
//        String text = "She opened the window and she she the street light.";
//        // create an empty Annotation just with the given text
//        Annotation document = new Annotation(text);
//
//        // run all Annotators on this text
//        pipeline.annotate(document);
//
//        // these are all the sentences in this document
//        List<CoreMap> sentences = document.get(SentencesAnnotation.class);
//
//        List<String> words = new ArrayList<>();
//        List<String> posTags = new ArrayList<>();
//        List<String> nerTags = new ArrayList<>();
//        for (CoreMap sentence : sentences) {
//            // traversing the words in the current sentence
//            for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
//                // this is the text of the token
//                String word = token.get(TextAnnotation.class);
//                words.add(word);
//                // this is the POS tag of the token
//                String pos = token.get(PartOfSpeechAnnotation.class);
//                posTags.add(pos);
//                // this is the NER label of the token
//                String ne = token.get(NamedEntityTagAnnotation.class);
//                nerTags.add(ne);
//            }
//        }
//        System.out.println(words.toString());
//        System.out.println(posTags.toString());
//        System.out.println(nerTags.toString());
//
//        System.out.println("End of Processing");
    }
}
