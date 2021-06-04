import java.util.*;

public class IsomorphicWords {
	public int countPairs(String[] words) {
		int total = 0;

		for (int j = 0; j < words.length; j++) {
			for (int k = j + 1; k < words.length; k++) {
				if (isIsomorphic(words[j], words[k])) {
					total += 1;
				}
			}
		}
		return total;
	}

	public Boolean isIsomorphic(String string1, String string2) {
		HashMap<String, String> map = new HashMap<String, String>(); 
		String[] str1 = string1.split("");
		String[] str2 = string2.split("");

		for(int i = 0; i < str1.length; i++){
			if(!map.containsKey(str1[i])) {
        		if (map.containsValue(str2[i])) {
        			return false;        				
        		} else {
        			map.put(str1[i], str2[i]);
        		}
        	} else {
        		if(!map.containsValue(str2[i])) {
        			return false;
        		} else if(!map.get(str1[i]).equals(str2[i])) {
        			return false;
        		}
        	}
		}
		return true;
	}

}