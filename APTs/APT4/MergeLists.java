public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode first = a; 
        if (a.next == null){
        	a.next = new ListNode(b.info, null);
        } else {
        	ListNode tempa = new ListNode(a.next.info, a.next.next); 
        	ListNode tempb = new ListNode(b.next.info, b.next.next);
        	a.next = new ListNode(b.info, weave(tempa, tempb));
        }
		return first;
	}	
}