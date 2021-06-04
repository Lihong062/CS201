import java.util.*;
public class FruitPageant {
    public String[] theBest(String[] votes){
        HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        for(String vote: votes){
            String[] temp = vote.split(":"); 
            map.putIfAbsent(temp[1], 0);
            map.put(temp[1], map.get(temp[1]) + 1);
        }
        int max = (Collections.max(map.values())); 
        ArrayList<String> fruits = new ArrayList<String>();
        for(String fruit: map.keySet()){
            if(map.get(fruit) == max){
                fruits.add(fruit);
            }
        }
        String[] ret = fruits.toArray(new String[0]);
        Arrays.sort(ret);
        Arrays.sort(ret, Comparator.comparing(String::length));
        return ret;
    }
}