import java.util.*;

public class GraphWanderer {
    int tracker; 
    Set<String> visited;

    public int pathLength(String[] connections, int start){
        tracker = 1;
        visited = new HashSet();
        visited.add(""+start);
        pathLengt(connections, start);
        return tracker;
    }

    public void pathLengt(String[] connections, int start){
        String temp2 = next(connections[start]);
        if(!temp2.equals("")){
            tracker += 1;
            visited.add(temp2);
            pathLengt(connections, Integer.parseInt(temp2));
        } 
    }

    private String next(String nodes){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(String node: nodes.split(" ")){
            if (!visited.contains(node)){
                temp.add(Integer.parseInt(node));
            }
        }
        try{return (""+Collections.min(temp));}
        catch(Exception e){return "";}     
        }
}