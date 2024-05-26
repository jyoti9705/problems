import java.util.LinkedList;
import java.util.Queue;

public class EvenOdd {
    public static void main(String[] args) {


    }

    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        if (root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean evenLevel = true;
        while (q.size() > 0) {
            int size = q.size();
            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (evenLevel) {
                    if (node.val % 2 == 0 || node.val <= prev) {
                        return false;
                    }
                } else {
                    if (node.val % 2 != 0 || node.val >= prev) {
                        return false;
                    }
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                prev = node.val;
            }
            evenLevel = !evenLevel;

        }
        return true;
    }


}

