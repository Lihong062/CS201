public class NotATree {
    public String check(TreeNode root){
    	if(root == null){
    		return "not a tree";
    	}if(root.left == null && root.right == null){
    		return "not a tree";
    	}if(root.left != null && root.right != null){
        	return "is a tree";
        }if(root.left == null){
        	String ret = check(root.right);
        	if(ret.equals("not a tree")){
        		return "not a tree";
        	} return "is a tree";
        }if(root.right == null){
        	String ret = check(root.left);
        	if(ret.equals("not a tree")){
        		return "not a tree";
        	} return "is a tree";
        }return "";
    }
}