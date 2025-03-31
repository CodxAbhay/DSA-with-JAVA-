

// implimenting the own method to stack data structure using stack


import java.util.Stack;

public class basic {
    static void display(Stack<Integer> st){
        // using recursion diplay the stack
        if(st.size() == 0){
            return;
        }
        int x = st.pop();
        display(st);
        System.out.print(x+" ");
        st.push(x);
    }
    // by this method we only displaying the stack in reverse order 
    // not reversing the real value 
    static void displayreverse(Stack<Integer> st){
        // using recursion diplay the stack
        if(st.size() == 0){
            return;
        }
        int x = st.pop();
        System.out.print(x+" ");
        displayreverse(st);
        st.push(x);
    }

    static void removefromBottom(Stack<Integer> st){
        // using recursion 
        Stack<Integer> rt = new Stack<>();

        while(st.size() > 1){
            rt.push(st.pop());
        }
        st.pop();

        while(rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println();
        
    }

    static void pushAtBottom(Stack<Integer> st, int a)
    {
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        st.push(a);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }


    // reversing stack using recursion
    static void reverseStack(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        reverseStack(st);
        pushAtBottom(st, x);
    }
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(7);
        display(st);
        System.out.println();
        System.out.println(st);
        displayreverse(st);
        removefromBottom(st);
        System.out.println(st);
        pushAtBottom(st, 0);
        display(st);
        reverseStack(st);
        System.out.println();
        System.out.println(st);
        
    }
}
