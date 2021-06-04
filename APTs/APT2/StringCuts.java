import java.util.ArrayList;
import java.util.Arrays;

public class StringCuts {
    public static void main(String[] args) {
        String[] list = {"huge", "enormous", "big", "gigantic"};
        int minLength = 5;
        filter(list, minLength); 
    }

    static String[] filter(String[] list, int minLength) {
        ArrayList<String> ret = new ArrayList<String>();
        for(String word: list){
            if(word.length() >= minLength && !ret.contains(word)){
                ret.add(word);
            }
        }
        String[] toReturn = new String[ret.size()];
        for(int i = 0; i < ret.size(); i++){
            toReturn[i] = ret.get(i);
        }
    String print = Arrays.toString(toReturn);
    System.out.println(print);
    return toReturn; 
    }
}




