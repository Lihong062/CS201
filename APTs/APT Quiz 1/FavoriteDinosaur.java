import java.util.*;

public class FavoriteDinosaur {
        public String theBest(String[] dinos) {
            HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
            for(String entry: dinos){
            	String[] temp = entry.split(":");
            	map.putIfAbsent(temp[1], new ArrayList<String>());
            	map.get(temp[1]).add(temp[0]);
            }

            int max = 0; 
            String key = "";
            for(String dino: map.keySet()){ 
            	if(map.get(dino).size() > max){
					max = map.get(dino).size();
            		key = dino;
            	}
            }

	      	String[] ret = map.get(key).toArray(new String[map.get(key).size()]);
	      	Arrays.sort(ret); 
	      	return key + " " + String.join(" ", ret);
        }
    }