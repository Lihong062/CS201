import java.lang.Math; 

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long tracker = 0; 
        for(int item: sizes){
            tracker += Math.ceil((double)item/(double)clusterSize)*clusterSize;
        }
   		return tracker; 
    }
}