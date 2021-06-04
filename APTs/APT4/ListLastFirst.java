public class ListLastFirst {
    public ListNode move(ListNode list) {
    	if (list == null || list.next == null){
    		return list;
    	}

        ListNode a = list;
        ListNode pointer = list;
        while (pointer.next.next != null){
        	pointer = pointer.next;
        }
        ListNode b = new ListNode(pointer.next.info, a);
        pointer.next = null;
        return b;
    }
}