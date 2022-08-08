import model.DocumentData;
import search.TFIDF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class SequentialSearch {
    public static final String BOOKS_DIRECTORY="./resources/books";
    public static final String SEARCH_QUERY_1="The best detective that catches many criminals using his deductive methods";
    public static final String SEARCH_QUERY_2="The girl that falls through a rabbit hole into a fantasy wonderland";
    public static final String SEARCH_QUERY_3="A war between Russia and France in the cold winter";

    public static void main(String[] args) throws FileNotFoundException {
        File documentDirectory = new File(BOOKS_DIRECTORY);
        List<String> documents = Arrays.asList(documentDirectory.list())
                                    .stream().map(documentName->BOOKS_DIRECTORY+"/"+documentName)
                                    .collect(Collectors.toList());
        List<String> terms = TFIDF.getWordsFromLine(SEARCH_QUERY_1);
        findMostRelevantDocuments(documents,terms);
    }
    private static void findMostRelevantDocuments(List<String> documents, List<String> terms) throws FileNotFoundException {
        Map<String, DocumentData> documentDataMap = new HashMap<>();
        for(String document:documents){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(document));
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            List<String> words = TFIDF.getWordsFromLines(lines);
        }
    }
}
