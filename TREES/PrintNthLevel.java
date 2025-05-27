
// if N == 2 -- print 2nd lavel all the Node data

public class PrintNthLevel {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static void NthLavel(Node root, int level, int N){
        if(root == null) return;
        //using the concept of pre order traversal -- and when our lvl match the given lavel we print it
        if(level == N){
            System.out.print(root.val+" ");
        }

        NthLavel(root.left, level+1, N);
        NthLavel(root.right, level+1, N);
    }

    // to find the sum of Nth level
    public static int sumNthLevel(Node root, int level, int N){
        if(root == null) return 0;
        // if reached the Nth level, return the value of the node
        if(level == N){
            return root.val;
        }
        return sumNthLevel(root.left, level+1, N) + sumNthLevel(root.right, level+1, N);
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
        // here N is the level where we want to see the all Node
        NthLavel(root, 1, 2);
        System.out.println();
        System.out.println(sumNthLevel(root, 1, 2));
    }
}
