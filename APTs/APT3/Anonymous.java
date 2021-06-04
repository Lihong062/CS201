import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {

        // Store all the letters that we have into a map 
        HashMap<String, Integer> reserve = new HashMap<String, Integer>();
        reserve.put(" ", 9999999);
        for(String headline: headlines) {
        	headline = headline.toLowerCase();
        	String[] temp = headline.split("");
        	for(String letter: temp){
        		if(!reserve.containsKey(letter)) {
        			reserve.put(letter, 1);
        		} else {
        			reserve.put(letter, reserve.get(letter) + 1);
        		}
        	}
        }

        // Check if each message can be made, if not subtract 1 from tracker 
        int tracker = messages.length; 
        for(String message: messages){
        	message = message.toLowerCase();
        	String[] temp = message.split("");
        	HashMap<String, Integer> map = new HashMap<String, Integer>();
        	for(String letter: temp){
        		if(!map.containsKey(letter)) {
        			map.put(letter, 1);
        		} else {
        			map.put(letter, map.get(letter) + 1);
        		}
        	}

        	for(String letter: map.keySet()) {
        		if(!reserve.containsKey(letter) || reserve.get(letter) < map.get(letter)) {
        			tracker += -1;
        			break;
        		}
        	}
        }
        return tracker;
    }
}