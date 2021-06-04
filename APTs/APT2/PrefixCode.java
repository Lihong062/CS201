public class PrefixCode { 
    public String isOne(String[] words) {
        for(Integer i = 0; i < words.length; i++){
            for(Integer j = 0; j < words.length; j++){
                if(i != j && words[i].length() <= words[j].length() && 
                (words[j].substring(0, words[i].length()).equals(words[i]))){
                    String n = Integer.toString(i);
                    return "No, " + n; 
                }
            }
        }
        return "Yes";
    }
}
