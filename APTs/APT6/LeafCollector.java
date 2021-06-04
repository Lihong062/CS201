import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> collections = new ArrayList<String>();
        while(!isLeaf(tree)) {
            ArrayList <String> temp = new ArrayList<>();
            collectAndRemove(tree, temp);
            collections.add(String.join(" ", temp));
        }
        
        ArrayList <String> temp = new ArrayList<>();
        temp.add("" + tree.info);
        collections.add(String.join(" ", temp));
        return collections.toArray(new String[0]);
    }

    private Boolean isLeaf(TreeNode tree) {
        if (tree == null) return false;
        return (tree.left == null && tree.right == null);
    }

    private void collectAndRemove(TreeNode root, List<String> list) {
    	if (root == null) return;
        if (isLeaf(root.left)) {
            list.add("" + root.left.info);
            root.left = null;
        }
        if (!isLeaf(root.left)) {
            collectAndRemove(root.left, list);
        }
        if (isLeaf(root.right)) {
            list.add("" + root.right.info);
            root.right = null;
        }
        if (!isLeaf(root.right)) {
            collectAndRemove(root.right, list);
        }
    }
}