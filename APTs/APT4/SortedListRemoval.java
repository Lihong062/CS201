public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
    	if (list == null || list.next == null){
    		return list;
    	}

        ListNode pointer = list; 
        while (pointer.next != null){ 
        	while (pointer.next.info == pointer.info){
        		if (pointer.next.next == null){
        			pointer.next = null;
        			return list;
        		}
        		pointer.next = pointer.next.next;
        	}
        	pointer = pointer.next;
        }
	return list;
    }
}