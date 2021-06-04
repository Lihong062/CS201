import java.util.ArrayList;
import java.util.HashSet; 
import java.util.Arrays;
import java.util.Collections;

public class BigWord {
    public String most(String[] sentences) {
        // create an arraylist of all the words, while seperating out each word 
    	ArrayList<String> words = new ArrayList<String>(); 
    	for(String sentence: sentences){
    		String[] temp = sentence.split(" "); 
    		for(String word: temp){
    			words.add(word.toLowerCase()); 
    		}
    	}
    	// create array of unique words, and parallel tracker array 
    	HashSet<String> temp = new HashSet<String>(words); 
    	String[] uniqueWords = new String[temp.size()];
	    temp.toArray(uniqueWords); 
    	Integer[] trackerArray = new Integer[uniqueWords.length]; 
    	// count how many times each element of uniqueWords appear 
    	for(int i = 0; i < uniqueWords.length; i++){
    		Integer tracker = 0;
    		for(String word: words){
    			if(uniqueWords[i].equals(word)){
    				tracker ++; 
    			}
    		}
    		trackerArray[i] = tracker; 
    	}
    	// get max index of trackerArray, and return corresponding value in uniqueWords 
    	Integer max = Collections.max(Arrays.asList(trackerArray));
    	int index = Arrays.asList(trackerArray).indexOf(max); 
    	return uniqueWords[index];
    }
}