import java.util.ArrayList;
import java.util.Collections;

import javax.swing.tree.TreeNode;

public class leafToRoot {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    
    public static boolean print(Node root, Node leaf, ArrayList<Integer> ans ){
        if(root == null) return false;
        ans.add(root.val);
        if(root == leaf) return true; // if we found the leaf node, return true
        // check in left subtree
        if(print(root.left, leaf, ans)) {
            return true; // if found in left subtree, return true
        }
        // check in right subtree
        if(print(root.right, leaf, ans)) {
            return true; // if found in right subtree, return true
        }
        ans.remove(ans.size() - 1); // if not found, remove the current node from the path
        return false; // return false if leaf is not found in either subtree
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        Node g = new Node(8);
        Node h = new Node(9);
        c.left = g;
        c.right = h;
        ArrayList<Integer> ans = new ArrayList<>();
        if(print(root, g, ans)){
            System.out.println(ans);
            // Reverse the list to get the path from leaf to root
            Collections.reverse(ans);
            System.out.println("Path from leaf to root: " + ans);
        }else {
            System.out.println("Leaf node not found in the tree.");
        }
    }
}
