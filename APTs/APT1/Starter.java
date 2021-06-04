import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {
        ArrayList<String> list = new ArrayList<String>();
        int tracker = 0;
        for(String word: words){
            if(first.equals(word.substring(0,1)) && !list.contains(word)){
                tracker++;
                list.add(word);
            }
        }
        return tracker;
    }
}
