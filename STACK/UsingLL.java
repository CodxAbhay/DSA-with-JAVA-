// Stack implimentation using LinkedList..

public class UsingLL {
    // making an linked list'
    public static class Node {
        int val;
        Node next;
        Node(int val){  // constructor
            this.val = val;
        }
    }

    public static class StackLL{
        Node head = null;
        int size = 0;

        void push(int y){
            Node t =  new Node(y);
            t.next = head;
            head = t;
            size++;
        }

        int pop(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;  // this is poped vlaue storing in a valriable so that it will not lost
            head = head.next;
            size--;
            return x;  // and here we are returning it .

        }
        
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;

        }

        void display(){
            Node temp1 = head;
            while(temp1 != null){
                System.out.print(temp1.val+" ");
                temp1 = temp1.next;
            }
            System.out.println();
        }

        void size() {
            System.out.println("Size of Stack is : "+size);
        }
    }


    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(23);
        st.push(50);
        st.push(60);
        st.size();
        st.display();
        st.pop();
        st.pop();
        st.display();
        st.peek();
        st.size();
        

    }
}
