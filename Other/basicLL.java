//  creating basic linked list


public class basicLL {
    // making Node class
    public static class Node{
        int data;  // value
        Node next;  // address of next node
 
        Node(int data){  // making constructor to accesss the data into the node 
            this.data = data;
        }
        
    }
     
    static void inserAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){ // this condition is used to reach the  tail 
            t = t.next;   // here we reached to tail of  ll 
        }
        t.next = temp;
        // and temp is pointing to  null automatic.
    }

    // printing linked list recursively::
    static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    static void length(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Length of Linkedlist is : "+count);

    }

    
    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // FINDING THE Nth NODE FORM LAST IF THE INDEX(Nth) AND THE HEAD ONLY GIVEN !!

    public static Node nthNode(Node head ,int idx){
        int size = 0;
        Node temp = head;
        while(temp != null ){
            size++;
            temp = temp.next;
        }
        
        int idxfromstart = size - idx + 1;
        temp = head;
        for(int i = 1 ; i<=idxfromstart-1;i++){
            temp = temp.next;
        }
        return temp;

    }
    // but this is using two traversal to reach the goal
    // Now we are going to find it in ONE traversal
    // here we will make two pointer SLOW and FAST and insitilze with HEAD  then we well move fast to nth times 
    // which is given in the index to find then we start to move slow with one index and fast with another index 
    
    public static Node nthNode2(Node head , int idx){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<=idx;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node deleteNthNodeFromEnd(Node head , int x){
        Node slow = head;
        Node fast = head;
        for(int i = 1 ;i<=x;i++){
            fast = fast.next;
        }
        if(fast == null) {
            head = head.next;
            return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        // making different node 
        Node a = new Node(5);  // head node
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(2);
        Node f = new Node(12);
        // making connection of each node 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 -> 6 -> 7 -> 8 -> -> 2 -> 12
        inserAtEnd(a, 100);

        // 5 -> 6 -> 7 -> 8 -> -> 2 -> 12 -> 100
        
        display(a);

        displayRec(a);

        length(a);

        Node temp = nthNode(a,2); // using two traversal
        Node temp1 = nthNode2(a,3); // using only one traversal (using two lopps but in first loop we are going till nth)
        System.out.println(temp.data);  // starting index 1
        System.out.println(temp1.data);  // starting with 0
        System.out.println("Deleting node form last 3rd value");
        a = deleteNthNodeFromEnd(a, 7);
        display(a);
        
        
    }

    
}
