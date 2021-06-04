public class RemoveMin {
    private int min (ListNode list){
        int min = list.info;    
        while (list != null) {
            if (min > list.info) min = list.info;  
            list = list.next;
        }
        return min;
    }

    public ListNode remove (ListNode list) {
        int min = min(list); 

        if ((list.next != null) && (list.info == min)){
            ListNode replace = new ListNode(list.next.info, list.next.next);
            return replace;
        }

        ListNode first = list;
        while (list != null) {
            if ((list.next == null) && (list.info == min)) {           
                return null;
            }
            else if ((list.next.next == null) && (list.info != min)) {    
                list.next = null;
                return first;
            }
            else if ((list.next.next != null) && (list.next.info == min)){ 
                list.next = list.next.next;
                return first;
            }
            list = list.next;
        }
        return first;
    }
}