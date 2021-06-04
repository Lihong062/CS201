import java.util.*;

public class UniqueTreeValues {
    TreeSet<Integer> uniqueNums = new TreeSet<>();
    public int[] unique(TreeNode root) {
        inspect(root);
        int ret[] = new int[uniqueNums.size()];
        int i = 0;
        for (int num : uniqueNums) {
            ret[i] = num;
            i++;
        }
        return ret;
    }

    private void inspect(TreeNode root) {
        if (root == null) return;
        uniqueNums.add(root.info);
        inspect(root.left);
        inspect(root.right);
    }
}