import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int ascaii = (int)ch;
            if(ascaii >=48 && ascaii <= 57){
                String val = ""+ch;
                st.push(val);
            }else{
                String val2 = st.pop();
                String val1 = st.pop();
                String op = ch+"";  
                // (val1 op val2)  this will be our answer
                String p = '('+val1 + op+ val2+')';  // adding extra breakets so that ans will be correct;
                st.push(p);
            }
        }
        System.out.println(st.peek());
    }
}
