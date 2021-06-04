import java.util.*;

public class PopularCelestialBodies {
        public String[] superStars(String[] favs){
            HashSet<String> intersection = new HashSet<String>();

	        for(String element: favs){ 
	        	String[] temp_list = element.split(" ");
	        	Set<String> temp_set = new HashSet<String>(Arrays.asList(temp_list));
	        	intersection.addAll(temp_set);
	        }
	        for(String element: favs){ 
	        	String[] temp_list = element.split(" ");
	        	Set<String> temp_set = new HashSet<String>(Arrays.asList(temp_list));
	        	intersection.retainAll(temp_set);
	        }

	        String[] ret = new String[intersection.size()];
	      	intersection.toArray(ret);
	      	Arrays.sort(ret); 
	      	return ret;
        }
    }