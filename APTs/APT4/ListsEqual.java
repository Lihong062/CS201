public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        if (a1 == null ^ a2 == null) return 0;
        while(a1 != null && a2 != null) {
            if((a1.info != a2.info) || (a1.next == null ^ a2.next == null)) {
                return 0;
            }
            a1 = a1.next;
            a2 = a2.next;
        }
        return 1;
    }
}