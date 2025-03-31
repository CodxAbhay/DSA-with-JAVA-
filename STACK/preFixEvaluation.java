import java.util.Stack;

public class preFixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String s = "-9/*+5346";

        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascaii = (int)ch;
            // now cheack whether it is a integer or not;
            if(ascaii>=48 && ascaii <= 57){
                st.push(ascaii-48);
            }else{
                int val1 = st.pop();
                int val2 = st.pop();
                if(ch == '+') st.push(val1+val2);
                if(ch == '-') st.push(val1-val2);
                if(ch == '*') st.push(val1*val2);
                if(ch == '/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}
