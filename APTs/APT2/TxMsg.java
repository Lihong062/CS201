import java.util.ArrayList;
import java.util.Arrays;

public class TxMsg {
    public String getMessage(String original) {
        String[] text = original.split(" "); 

        for(int i = 0; i < text.length; i++){
        	String[] word = text[i].split("");
        	String txmsg = ""; 
        	if(isAllVowel(word)){
        		txmsg = String.join("", word);
        	}
        	else{
        		for(int j = 0; j < word.length; j++){
        			if(j == 0 && !isVowel(word[j])){
        				txmsg += word[j];
        			} else if(!isVowel(word[j]) && isVowel(word[j-1])){
        				txmsg += word[j];
        			}
        		}
        	}
        	text[i] = txmsg; 
        }
        return String.join(" ", text); 
    }


    public Boolean isVowel(String letter){
    	if("aeiou".contains(letter)){
    		return true;
    	}
    	return false; 
    }

    public Boolean isAllVowel(String[] word){
    	for(String letter: word){
    		if(!isVowel(letter)){
    			return false;
    		}
    	}
    	return true; 
    }
}