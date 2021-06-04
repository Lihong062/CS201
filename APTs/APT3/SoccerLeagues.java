import java.util.*;

public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] ret = new int[matches.length];
        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < matches[i].length(); j++){
                if(matches[i].charAt(j) == 'W'){
                    ret[i] += 3;
                } else if(matches[i].charAt(j) == 'D'){
                    ret[i] += 1;
                    ret[j] += 1;
                } else if(matches[i].charAt(j) == 'L'){
                    ret[j] += 3;
                }
            }
        }
        return ret;
    }
}