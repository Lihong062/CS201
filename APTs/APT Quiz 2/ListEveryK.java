public class ListEveryK {
    public int sumTheKth(ListNode list, int k){
    	if(list == null) return 0; 
        int sum = 0; 
        int tracker = 0; 
        while(list != null){
    		tracker += 1; 
    		if(tracker % k == 0){
    			sum += list.info;
    		}list = list.next; 
    	}return sum;
    }
}