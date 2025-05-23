
public class makingLinkedL_usingOOPS {

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
            if(head == null){  // empty ll
                head = temp;
                tail = temp;
            }else{  // if there is a element in the ll
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val ){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        // inserting value in ll  at given index 
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val);
                return;
            } 
            else if(idx == 0){
                insertAtBigining(val);
                return;
            }
            else if (idx < 0 && idx > size()) {
                System.out.println("Wrong index !!!");
                return;
            }
            
            for(int i = 1 ; i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void deleteAt(int idx , int val){
            Node temp = head;
            if(idx == 0){
                temp = temp.next;
                
            }
            for(int i = 1 ; i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        void getAt(int idx){
            Node temp = head;
            if (idx < 0 && idx > size()) {
                System.out.println("Wrong index !!!");
                return;
            }
            for(int i = 1 ; i<=idx ; i++){
                temp = temp.next;
            }
            System.out.println();
            System.out.println(temp.data);
        }


        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            if(temp == null) return -1;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);

        ll.insertAtBigining(0);
        ll.insertAtBigining(10);
        ll.insertAt(2, 100);

        
        ll.display();

        ll.getAt(2);

        
    }
}
