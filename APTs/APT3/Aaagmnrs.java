import java.util.*;

public class Aaagmnrs {
  public String[] anagrams(String[] phrases) {
    for(int i = 0; i < phrases.length; i++) {
      for(int j = i + 1; j < phrases.length; j++) {
        if(isAnagram(phrases[i], phrases[j])) {
          phrases[j] = "";
        }
      }
    }
    ArrayList<String> temp = new ArrayList<String>();
    for(int i = 0; i < phrases.length; i++) {
      if(!phrases[i].equals("")) {
        temp.add(phrases[i]);
      }
    }
    String[] ret = new String[temp.size()]; 
    ret = temp.toArray(ret); 
    return ret;
  }

  public Boolean isAnagram(String str1, String str2) { 
    str1 = str1.replaceAll(" ", "");
    str2 = str2.replaceAll(" ", "");
    str1 = str1.toLowerCase(); 
    str2 = str2.toLowerCase();
    String[] arr1 = str1.split(""); 
    String[] arr2 = str2.split("");
    Arrays.sort(arr1); 
    Arrays.sort(arr2); 
    if(arr1.length != arr2.length) { 
      return false;
    } else {
      for(int i = 0; i < arr1.length; i++) {
        if(!arr1[i].equals(arr2[i])) {
          return false;
        }
      }
    }
    return true;
  }
}