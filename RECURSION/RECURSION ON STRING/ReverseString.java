
// reversing the string using recursion ...... *** MOST IMPORTENT AND EASY ***
// AND ALSO FINDING THAT THE STRING IS PLINDROM OR NOT ex. (( LEVEL == LEVEL ))

import java.util.Scanner;

public class ReverseString{
    static String reverse(String s, int idx){      //
        if (idx == s.length()) return "";         //
        String smallans = reverse(s, idx+1);     // recurisve work 
        return smallans + s.charAt(idx);        // self work 
        
        //adding the fist char in last by concating s.charAt(idx) in recursive call
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s, 0);
        System.out.println(rev);

        // to make this program for cheacking that it is a plindrom or not
        if (s.equals(rev)){
            System.out.printf("%s String is Plindrom  ",s);
        }else{
            System.out.println("NOT Plindrom ");
        }

        
    }
}
