import java.util.Stack;

//  while solving prefix always start from last (n-1)
// we are going to convert prefix to postfix

public class prefixToPostfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i = s.length()-1 ; i>=0; i--){
            char ch = s.charAt(i);
            int ascai = (int)ch;
            if(ascai >=48 && ascai <= 57){
                String t = ch+"" ; // converted int to string
                st.push(t);
            }else{  // beacuse we are iteration form last so val1 will be the first value;
                String val1 = st.pop();
                String val2 = st.pop();
                String p = val1+val2+ch; // here ch will be the current operator
                st.push(p);
            }
        }
        System.out.println(st.peek());
    }
}
