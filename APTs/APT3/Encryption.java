import java.util.*;

public class Encryption {
        public String encrypt(String message){
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        HashMap<String, String> code = new HashMap<String, String>();
        int index = 0; 
        String[] message_array = message.split("");

        for(String letter: message_array){
        	if(!code.containsKey(letter)) {
        		code.put(letter, alphabet[index]);
        		index += 1;
        	} 
        }

        String ret = "";
        for(String letter: message_array){
        	ret += code.get(letter);
        }

        return ret;
    }
}