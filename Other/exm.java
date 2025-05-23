public class exm {
    public static void main(String[] args) {
        // Invoke the scoreOfString method with the argument "hello"
        System.out.println(scoreOfString("hello"));
    }
    public static int scoreOfString(String s) {
        int ans = 0;
        for(int i = 0; i<s.length();i++){
            if(i == s.length()-1){
                break;
            }
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            int num = Math.abs((int)(ch) - (int)(ch1) );
            ans += num;
        }
        return ans;
    }
}