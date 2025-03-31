
// return all the subsequences in an arraylist./
// subsequences means eg. "abc"  >> output = a,ab,abc,b,bc,c

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubesqunce {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));
        
        // this is the main work to print all the sequences 

        for(String i: smallans){  // for string ss in smallans 
            ans.add(i);    // add all string i in ans 
            ans.add(curr + i);  // this will add string atteched with current character
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();  // abc

        ArrayList<String> ans = getSSQ(s);
        for(String i : ans){   // for String i in ans
            System.out.println(i);
        }
        
    }
}
