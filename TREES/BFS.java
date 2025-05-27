
// solve using queue data structure

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

    // so the Lavel Order traversal is equal to BFS   -- iterative way
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);   // 1. first add the root in queue 
        while (q.size() > 0) {
            Node temp = q.peek();
            if(temp.left != null ) q.add(temp.left);  // 2. add the LEFT child of that root in queue 
            if(temp.right != null ) q.add(temp.right); // 3. add the RIGHT child of that root in queue 
            System.out.print(temp.val + " ");  // 4. print the root 
            q.remove();  // 5. remove the root
        }
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
        bfs(root);
    }
}
