// this is not best opporach to solve it but for begginer ..

import java.util.Stack;

public class preFixSum {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        String s = "9-(5+3)*4/6";  // ans = 4
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascaii = (int)ch;  // when you convert a string(integer) it will have some ascaii value 
            // here the ascaii value >> '0' = 48 and '9' = 57
            // 
            // lets say asscai = 53 it means 48+5=53 >> so the value will be 53-48 = 5;

            if(ascaii >= 48 && ascaii <= 57) st.push(ascaii-48);
            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    // till then do work
                    int val2 = st.pop();
                    int val1 = st.pop();

                    if(op.peek() == '+') st.push(val1+val2);
                    if(op.peek() == '-') st.push(val1-val2);
                    if(op.peek() == '*') st.push(val1*val2);
                    if(op.peek() == '/') st.push(val1/val2);
                    // remove the current operater then
                    op.pop();
                }
                // remove this '(' breaket
                op.pop();
            }
            else{
                if(ch == '+' || ch == '-'){
                    // pop the element in variable and finish the work
                    int val2 = st.pop();
                    int val1 = st.pop();

                    if(op.peek() == '+') st.push(val1+val2);
                    if(op.peek() == '-') st.push(val1-val2);
                    if(op.peek() == '*') st.push(val1*val2);
                    if(op.peek() == '/') st.push(val1/val2);
                    // remove the current operater then
                    op.pop();
                    // add the current operator from string
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        int val2 = st.pop();
                        int val1 = st.pop();
                        if(op.peek() == '*') st.push(val1*val2);
                        if(op.peek() == '/') st.push(val1/val2);
                        op.pop();
                        op.push(ch);
                    }else
                    {
                        op.push(ch);
                    }
                }
            }
        }

        while(st.size() >1){
            int val2 = st.pop();
            int val1 = st.pop();

            if(op.peek() == '+') st.push(val1+val2);
            if(op.peek() == '-') st.push(val1-val2);
            if(op.peek() == '*') st.push(val1*val2);
            if(op.peek() == '/') st.push(val1/val2);
            // remove the current operater then
            op.pop();
        }
        System.out.println(st.peek());

    }
}
