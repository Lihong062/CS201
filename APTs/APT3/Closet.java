import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        HashSet<String> intersection = new HashSet<String>();

        for(String element: list){ 
        	String[] temp_list = element.split(" ");
        	Set<String> temp_set = new HashSet<String>(Arrays.asList(temp_list));
        	intersection.addAll(temp_set);
        }

        String[] ret = new String[intersection.size()];
      	intersection.toArray(ret);
      	Arrays.sort(ret); 

      	return String.join(" ", ret);
    }
}