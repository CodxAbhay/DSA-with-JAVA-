
//implimentation of queue using Linkedlist;
//
class QueueImplitation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class queuell{
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove(){
            if(size == 0){
                System.out.print("Queue is empty : ");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        void peek(){
            if(size == 0){
                System.out.print("Queue is empty : ");
                return;
            }
            System.out.println(head.val);
        }
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        queuell q1 = new queuell();
        q1.add(1);
        q1.add(6);
        q1.add(2);
        q1.add(3);
        q1.add(7);
        q1.display();
        q1.remove();
        q1.display();
        q1.peek();
    }  
}