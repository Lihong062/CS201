import java.util.*;

public class Thesaurus {

    public String[] edit(String[] entry) {
    	ArrayList<HashSet<String>> entries = new ArrayList<HashSet<String>>(); 
    	for(String words: entry){
    		entries.add(toSet(words));
    	}
    	for(int k = 0; k < entries.size(); k++) {
    		for(int i = 0; i < entries.size(); i++) {
    			for(int j = 0; j < entries.size(); j++) {
    				if(i < entries.size() && j < entries.size() && i != j && inCommon(entries.get(i), entries.get(j)) >= 2){
    					entries.get(i).addAll(entries.get(j));
    					entries.remove(j);
    				}
    			}
   			}
    	}

   		ArrayList<String> toReturn = new ArrayList<String>();
   		for(HashSet<String> set: entries) {
   			if(!set.equals(null)){
   				String[] temp = new String[set.size()];
        		temp = set.toArray(temp); 
        		Arrays.sort(temp);
        		String append = String.join(" ", temp);
        		toReturn.add(append);
   			}
   		}

		String[] ret = new String[toReturn.size()];
        ret = toReturn.toArray(ret); 
   		Arrays.sort(ret);
   		return ret;
    }

    public HashSet<String> toSet(String entry) {
    	String[] temp = entry.split(" ");
    	HashSet<String> ret = new HashSet<String>(Arrays.asList(temp)); 
    	return ret;
    }

    public int inCommon(HashSet<String> set1, HashSet<String> set2) {
    	HashSet<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		int ret = intersection.size();
		return ret;
    }
}