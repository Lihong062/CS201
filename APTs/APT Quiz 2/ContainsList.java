public class ContainsList {
    public String check(ListNode first, ListNode second){
        if(second == null){
        	return "YES";
        } if(first == null){
        	return "NO";
        }
        while(first != null){
        	if(first.info == second.info){
        		while(first != null && second != null && first.info == second.info){
        			first = first.next;
        			second = second.next;
        		} if(second == null){
        			return "YES";
        		} return "NO";
        	} first = first.next;
        } return "NO";
    }
}