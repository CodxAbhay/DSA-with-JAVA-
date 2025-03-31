import java.util.Stack;

//  in the prefix or postfix >> there will be never have a single breaket()[]{} 
// so solve without thinking of breakets/

public class postfixToPrefix {
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
                String p = ch+val1+val2;
                st.push(p);
            }
        }
        System.out.println(st.peek());
    }
}
