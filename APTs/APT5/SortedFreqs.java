import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        List dataList = Arrays.asList(data);
        TreeSet<String> set = new TreeSet<>(Arrays.asList(data));
        int[] ret = new int[set.size()];
        int index = 0;

        for (String item : set) {
            ret[index] = Collections.frequency(dataList, item);
            index++;
        }

        return ret;
    }
}