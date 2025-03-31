import java.util.Scanner;
import java.util.Stack;

public class BalancedBreakets {

    public static boolean isBalance(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{  // ch == ')'
                if(st.size() == 0) return false;
                if(st.peek() == '(' && ch == ')') st.pop();
            }
        }
        if(st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // ()())()()(()(()()()()()))
        System.out.println(isBalance(str));
    }
}
