import java.util.*;

public class LeafTrails {
    TreeMap<Integer, String> paths = new TreeMap<>();

    public String[] trails(TreeNode tree) {
        inspect(tree, "");
        String [] ret = new String[paths.size()];
        Object[] keys = paths.keySet().toArray();
        for (int i = 0; i < paths.size();i++) {
            ret[i] = paths.get(keys[i]);
        }
        return ret;
    }

    private void inspect (TreeNode tree, String path) {
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            paths.put(tree.info, path);
            return;
        }
        inspect(tree.left, path + "0");
        inspect(tree.right, path + "1");
    }
}