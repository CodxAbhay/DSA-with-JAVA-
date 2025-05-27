public class implimention {
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
// ---------------------------------------------------------------------------------------

    // function to print sum of  all node in the tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    // function print the size
    public static int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    // function to get maximum
    public static int max(Node root){
        if(root == null) return 0;
        return Math.max(root.val , Math.max(max(root.left) , max(root.right)));
    }
    // funtion to print multiplication of tree
    public static int multiplication(Node root){
        if(root == null){
            return 1;
        }
        return root.val * multiplication(root.left) * multiplication(root.right);
    }
    // // function to print height of tree (Edge wise)
    // public static int height(Node root){
    //     if(root == null || (root.left == null && root.right == null)){ 
    //         return 0;
    //     }
    //     return 1 + Math.max(height(root.left) , height(root.right));
    // }

    // align with the common definition (height as number of edges):
    public static int height(Node root) {
    if (root == null) {
        return -1; // Height of an empty tree
    }
    if (root.left == null && root.right == null) {
        return 0; // Height of a leaf node
    }
    return 1 + Math.max(height(root.left), height(root.right));
}

    // pre order traversal and printing 
    public static void PreOrder(Node root){
        if(root == null) return;
        // in pre order -- ROOT , LEFT , RIGHT [r L R]
        System.out.print(root.val+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void InOrder(Node root){
        if(root == null) return;
        // in pre order --  LEFT ,ROOT , RIGHT [L  r  R]
        
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }
    public static void PostOrder(Node root){
        if(root == null) return;
        // in pre order --  LEFT , RIGHT, ROOT [L  R  r]
        
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val+" ");
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

        System.out.println("Sum of all nodes in the tree: " + sum(root));
        System.out.println("Size of tree is : "+size(root));
        System.out.println("Maximum Node is : "+max(root));
        System.out.println("multiplication of all Node is : "+multiplication(root));
        System.out.println("height of the tree is : "+height(root));
        PreOrder(root);
        System.out.println();
        InOrder(root);
        System.out.println();
        PostOrder(root); 
        
    }
}
