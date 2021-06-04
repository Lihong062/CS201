public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] letters = str.split(" "); 
        int len = words.length;
        int[] ret = new int[len];
        for(int i=0; i<len; i++){
        	int tracker = 0;
        	for(String letter: letters){
        		if(letter.equals(words[i])){
        			tracker ++;
        		}
        	}
        	ret[i] = tracker;
        }
    return ret;
    }
}