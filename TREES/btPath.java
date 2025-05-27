public class btPath {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    // This function prints all root-to-leaf paths in a binary tree
    public static void rootToLeafPath(Node root, String path) {
        if (root == null) return; // base case
        path += root.val + "->"; // append current node value to path
        if (root.left == null && root.right == null) { // if it's a leaf node
            System.out.print(path); // print the path
            System.out.println();
            return;
        } else {
            rootToLeafPath(root.left, path); // traverse left subtree
            rootToLeafPath(root.right, path); // traverse right subtree
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(5);
        a.left = c;

        
        rootToLeafPath(root,""); // to indicate the end of the path
    }
}
