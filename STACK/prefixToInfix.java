import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i = s.length()-1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            int ascaii = (int)ch;
            if(ascaii >=48 && ascaii <= 57){
                st.push(ch+"");
            }else{  // +-/* 
                String val1 = st.pop();
                String val2 = st.pop();
                String op = ch+"";  
                // (val1 op val2)  this will be our answer
                String p = '('+ val1 + op + val2 +')';  // adding extra breakets so that ans will be correct;
                st.push(p);
            }
        }
        System.out.println(st.peek());
    }
}
