import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        List<String> list  = Arrays.asList(data);
        TreeSet<String> set = new TreeSet<>(list);
        List<String> list2 = new ArrayList(set);

        Comparator<String> freq = Comparator.comparing((item) -> Collections.frequency(list, item));
        Collections.sort(list2, freq.reversed());

        return list2.toArray(new String[0]);
    }
}