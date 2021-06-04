import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){

        HashSet<String> materials = new HashSet<String>();
        for(String material: available){
            materials.add(material);
        }

        for(int i = 0; i < orders.length; i++){
            HashSet<String> orderset = new HashSet<String>();
            String[] order = orders[i].split(" ");
            for(String material: order){
                orderset.add(material);
            }
            if(materials.containsAll(orderset)){
                return i;
            }
        }
        return -1; 
    }
}
