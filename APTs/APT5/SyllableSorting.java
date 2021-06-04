import java.util.*;

public class SyllableSorting {
	private boolean sameChars(String firstStr, String secondStr) {
  		String[] first = firstStr.split("");
  		String[] second = secondStr.split("");
  		Arrays.sort(first);
  		Arrays.sort(second);
  		return Arrays.equals(first, second);
	}

    public String[] sortWords(String[] words) {
        ArrayList<String> decompositions = new ArrayList<String>();
        for(String word: words){
        	String[] decomposition = word.split("(?<=[aeiou])");
        	Arrays.sort(decomposition); 
        	decompositions.add(String.join("", decomposition));
        }

        Collections.sort(decompositions);

       	String[] ret = new String[words.length];
       	for(int i = 0; i < decompositions.size(); i++){
       		for(int j = 0; j < words.length; j++){
       			if(sameChars(words[j], decompositions.get(i))){
       			System.out.println(words[j] + " " + decompositions.get(i));
       			ret[i] = words[j];
       			words[j] = "";
       			break;
       			}
       		}
       }

       return ret;
    }
}