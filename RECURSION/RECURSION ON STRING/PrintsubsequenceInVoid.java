// very important >> refer lecture number 35 from college wallah
// Given a String, write a method to print all its subsequences. 
// do not use any extra spacce use VOID retrun statement

import java.util.Scanner;


public class PrintsubsequenceInVoid {

    static void SSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currentChar = s.charAt(0);

        String remString = s.substring(1);

        SSQ(remString, currAns+currentChar); // including the current char into the string 
        SSQ(remString, currAns);  //  not including the current char into the string

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
       SSQ(s,"");



    }
}
