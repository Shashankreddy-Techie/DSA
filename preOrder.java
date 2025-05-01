import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    
    // Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            preorderHelper(node.left, result);
            preorderHelper(node.right, result);
        }
    }
}
