import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        int tracker = 0; 

        HashSet<String> dic = new HashSet<String>();
        for(String word: dictionary){
            dic.add(word);
        }

        HashSet<String> remember = new HashSet<String>();
        for(String word: player){
            remember.add(word);
        }

        for(String word: remember){
            if(dic.contains(word)){
                tracker += word.length()*word.length();
            }
        }
        return tracker;
    }
}