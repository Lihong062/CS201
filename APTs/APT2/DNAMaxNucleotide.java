import java.util.ArrayList;
import java.util.Arrays;


public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        ArrayList<String> dna = new ArrayList<String>(); 

        int max = 0;
        for(String strand: strands){
        	if(count(strand, nuc) > max){
        		max = count(strand, nuc);
        	}
        }

        for(String strand: strands){
        	if(max == count(strand, nuc) && max > 0){
        		dna.add(strand);
        	}
        }

        if(dna.size() == 0){
        	return "";
        }
        else{
        	return longest(dna);
        }
    }

    public int count(String word, String letter) {
    	int ret = word.length() - word.replace(letter, "").length();
    	return ret;
    }

   	public String longest(ArrayList<String> listOfWords) {
    	String longestWord = null;
    	for (String word : listOfWords) {
        	if (longestWord == null || word.length() > longestWord.length()) {
            	longestWord = word;
        	}
    	}
    	return longestWord;
	}
}