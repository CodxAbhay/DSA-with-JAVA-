
// finding that a string is plindrom or not without reversing  string 
// using the concept of 2 pointer and comparing it 

import java.util.Scanner;

public class StringPlindrom {
    
    static boolean FindPlindrom(String s, int startingIndex, int endingIndex){
        if (startingIndex >= endingIndex) return true;

        return (s.charAt(startingIndex) == s.charAt(endingIndex) && FindPlindrom(s, startingIndex+1, endingIndex-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(FindPlindrom(s, 0, n-1));

    }
}
