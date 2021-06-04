import java.util.*;

public class AllPaths {
    ArrayList<String> list = new ArrayList<>();

    public String[] paths(TreeNode t) {
        if (t == null) return new String[0];
        inspect(t, "");

        Collections.sort(list);
        String[] ret = list.toArray(new String[0]);
        return ret;
    }

    private Boolean isLeaf(TreeNode tree) {
        if (tree == null) return false;
        return (tree.left == null && tree.right == null);
    }

    private void inspect(TreeNode t, String path) {
        if (t == null) {
            return;
        } if (isLeaf(t)) {
            path += t.info;
            list.add(path);
        } else {
            path += t.info + "->";
        }

        inspect(t.left, path);
        inspect(t.right, path);
    }
}