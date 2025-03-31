// we are given only head element and we need to 
// finding the nth node from last for eg.  3rd index data from last 
// so we can applly the fromula of AP which is >>
//  if total element   =   m                            then 
//  (n)th term from last = (m-n+1)th term from start


public class Nth_NodeFrom_Last {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtBigining(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{  
                temp.next = head;
                head = temp;
            }
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        // Node nthNode(int idx){
        //     Node temp = head;
        //     int size = 0;
        //     while(temp != null ){
        //         size++;
        //     }
        //     temp = head;
        //     int idxfromstart = size - idx + 1;
        //     for(int i = 0 ; i<idxfromstart-1;i++){
        //         temp = temp.next;
        //     }
        //     return temp;


        // }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBigining(10);
        ll.insertAtEnd(12);
        ll.insertAtEnd(13);
        ll.insertAtEnd(15);
        ll.insertAtEnd(17);
        ll.insertAtEnd(22);
        ll.insertAtEnd(34);
        ll.display();
        // System.out.println(nthNode(3));

        
    }

    
}

