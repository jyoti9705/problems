public class MaximumAncestorDiff {
    public static void main(String[] args) {

    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findMaxDiff(root, root.val, root.val);

    }

    private int findMaxDiff(TreeNode root, int min, int max) {
        if (root == null) {
            return Math.abs(max - min);
        }
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        int left = findMaxDiff(root.left, min, max);
        int right = findMaxDiff(root.right, min, max);
        return Math.max(left, right);
    }
}
