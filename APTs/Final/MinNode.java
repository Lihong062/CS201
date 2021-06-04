import java.util.*;

public class MinNode {
	int min; 
	String path;
    public String locate(TreeNode root){
        min = root.info;
        path = "";
        traverse(root, path); 
        return path;     
    }

    private void traverse(TreeNode root, String rpath){
    	if (root == null) return; 
    	if (root.info < min) {
    		min = root.info; 
    		path = rpath;
    	}
    	if (root.left != null) traverse(root.left, rpath + "0"); 
    	if (root.right != null) traverse(root.right, rpath + "1");
    }
}