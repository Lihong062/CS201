import java.lang.Math;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {
        int tracker = 0;
        for(int index = 0; index < r.length; index ++){
            if(r[index] > Math.sqrt(Math.pow(x1-x[index], 2) + Math.pow(y1-y[index], 2)) 
                    && r[index] < Math.sqrt(Math.pow(x2-x[index], 2) + Math.pow(y2-y[index], 2))){
                tracker++;
            } else if(r[index] > Math.sqrt(Math.pow(x2-x[index], 2) + Math.pow(y2-y[index], 2))
                    && r[index] < Math.sqrt(Math.pow(x1-x[index], 2) + Math.pow(y1-y[index], 2))){
                tracker++;
            }
        }
        return tracker;
    }
}
