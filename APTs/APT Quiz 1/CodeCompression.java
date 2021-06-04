public class CodeCompression {
        public String compress(String message){
            String[] letters = message.split(""); 
            String ret = ""; 
            int tracker = 0;
            String pointer = "";

            for(int i = 0; i < letters.length; i++){
            	if(i == 0){
            		pointer = letters[i]; 
            		tracker = 1;
            		if(letters.length == 1){
            			ret += pointer + String.valueOf(tracker);
            		}
            	} 
            	else if(!letters[i-1].equals(letters[i])){
            		ret += pointer + String.valueOf(tracker);
            		pointer = letters[i];
            		tracker = 1; 
            	} 
            	else if(letters[i-1].equals(letters[i])){
            		tracker += 1;
            		if(i == letters.length - 1){
            		ret += pointer + String.valueOf(tracker);
            		}
            	}          	
            }
            return ret;
    }
}