public class Totality {
    public int sum(int[] a, String stype) {
        int tracker = 0;
        if(stype.equals("odd")){
            for(int index = 1; index < a.length; index += 2){
                tracker += a[index];
            }
        } else if(stype.equals("even")){
            for(int index = 0; index < a.length; index += 2) {
                tracker += a[index];
            }
        } else if(stype.equals("all")){
            for(int index = 0; index < a.length; index += 1) {
                tracker += a[index];
            }
        }
    return tracker;
    }
}

