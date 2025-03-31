
// this code will remove << a >> form a given string..

import java.util.Scanner;

public class RenoveChar {
    // method 1 using index parameter 

    static String removeA(String s , int idx){
        if (idx == s.length()){
            return " ";
        }
        String smallans = removeA(s, idx+1);
        char ans = s.charAt(idx);
        if( ans != 'a'){
            return ans+smallans;
        }else{
            return smallans;
        }
    }

    // method 2 without using parameter idx insted of using << s.substring >>
    static String removeB(String s ){
        if (s.length() == 0) return "";

        String smallans = removeB(s.substring(1));
        
        char ans = s.charAt(0);  
        if (ans != 'a'){
            return ans + smallans;
        }else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
        System.out.println(removeB(s));

    }    
}
