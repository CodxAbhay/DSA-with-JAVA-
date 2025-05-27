
public class SameTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true; // Both trees are empty
        }
        if(p == null || q == null) {
            return false; // One tree is empty, the other is not
        }
        if(p.val != q.val) {
            return false; // Values of the current nodes are different
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        a.left = c;
        a.right = d;
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        b.left = e;
        b.right = f;
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(9);
        c.left = g;
        c.right = h;

        // seocnd tree
        TreeNode root2 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);  
        TreeNode b2 = new TreeNode(3);
        root2.left = a2;
        root2.right = b2;
        TreeNode c2 = new TreeNode(4);
        TreeNode d2 = new TreeNode(5);
        a2.left = c2;
        a2.right = d2;
        TreeNode e2 = new TreeNode(6);
        TreeNode f2 = new TreeNode(7);
        b2.left = e2;
        b2.right = f2;
        TreeNode g2 = new TreeNode(8);
        // TreeNode h2 = new TreeNode(9);
        c2.left = g2;
        // c2.right = h2;
        // Test cases
        System.out.println(isSameTree(root, root2)); 
}
}