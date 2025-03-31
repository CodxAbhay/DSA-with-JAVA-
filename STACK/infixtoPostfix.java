
// converting  the infix expration to postfix 

import java.util.Stack;

public class infixtoPostfix {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        String infix = "9-(5+3)*4/6";  // ans = 4
        for(int i = 0 ; i<infix.length(); i++){
            char ch = infix.charAt(i);
            int ascaii = (int)ch;  // when you convert a string(integer) it will have some ascaii value 
            // here the ascaii value >> '0' = 48 and '9' = 57
            // 
            // lets say asscai = 53 it means 48+5=53 >> so the value will be 53-48 = 5;

            if(ascaii >= 48 && ascaii <= 57){
                String t = ch + "";  // this is a method to make integer to string
                st.push(t);
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    // till then do work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();  // because it is just a character
                    String x = v1+v2+o;
                    st.push(x);
                }
                // remove this '(' breaket
                op.pop();
            }
            else{
                if(ch == '+' || ch == '-'){
                    // pop the element in variable and finish the work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();  // because it is just a character
                    String x = v1+v2+o;
                    st.push(x);
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){

                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();  // because it is just a character
                        String x = v1+v2+o;
                        st.push(x);
                        op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }
        }

        while(st.size() >1){
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();  // because it is just a character
            String x = v1+v2+o;
            st.push(x);
            // remove the current operater then
            
        }
        System.out.println(st.peek());
    }
}
