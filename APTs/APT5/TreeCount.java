public class TreeCount {
    int sum = 0;
    public int count(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        return count(tree.left) + count(tree.right) + 1;
    }
}