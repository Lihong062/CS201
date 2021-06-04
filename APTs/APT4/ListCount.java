public class ListCount {
    public int count (ListNode list) {
    	if(list == null) return 0; 
    	int tracker = 0; 
    	while(list != null){
    		tracker += 1; 
    		list = list.next; 
    	}
    	return tracker; 
    }
}