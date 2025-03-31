import java.util.Stack;

public class postFixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String postfix = "953+4*6/-";

        for(int i = 0 ; i<postfix.length() ; i++){
            char ch = postfix.charAt(i);
            int ascaii = (int)ch;
            if(ascaii>=48 && ascaii <=57) st.push(ascaii-48);
            else{  // here the operater comes>>
                int val2 = st.pop();
                int val1 = st.pop();
                if(ch == '+') st.push(val1+val2);
                if(ch == '-') st.push(val1-val2);
                if(ch == '*') st.push(val1*val2);
                if(ch == '/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());


    }
}
