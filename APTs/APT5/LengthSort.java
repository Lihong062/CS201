
import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values){
        Comparator<String> byLength = Comparator.comparing(String::length);
        Arrays.sort(values);
        Arrays.sort(values, byLength);
        return values;
    }
}
