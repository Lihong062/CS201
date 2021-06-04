import java.util.Arrays;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> sortedWords = new TreeSet<>(Arrays.asList(words));
        String[] list = sortedWords.toArray(new String[0]);
        ListNode curr = new ListNode(list[0].length(), null);
        ListNode first = curr;
        for(int i = 1; i < list.length; i++) {
            curr.next = new ListNode(list[i].length(), null);
            curr = curr.next;
        }
        return first;
    }
}