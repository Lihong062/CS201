import java.util.*;

public class SortedLeaves {
    TreeSet sorted = new TreeSet<String>();
    public String[] values(TreeNode tree) {
        doWork(tree);
        String[] ret = (String[]) sorted.toArray(new String[0]);
        return ret;
    }

    public void doWork(TreeNode tree) {
        if (tree == null) return;
        if (tree.left == null && tree.right == null) {
            sorted.add("" + ((char)tree.info));
        }
        else {
            doWork(tree.left);
            doWork(tree.right);
        }
    }
}