import java.lang.Math; 


public class PairDown {
    public int[] fold(int[] list) {
        int len = (int)((list.length+1)/2); 
        int[] ret = new int[len];

        if(list.length % 2 == 1){
        	for(int i = 0; i < list.length - 1; i += 2){ 
        		int index = i/2; 
        		int number = list[i] + list[i+1]; 
        		ret[index] = number; 
        	}
        	ret[ret.length - 1] = list[list.length - 1]; 
        }
        else{
        	for(int i = 0; i < list.length; i += 2){ 
        		int index = i/2; 
        		int number = list[i] + list[i+1]; 
        		ret[index] = number; 
        	}
        }
        return ret; 
    }
}