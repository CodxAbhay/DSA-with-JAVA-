
// printing all the substring of given string 
/*
 * so basically the substring of a given string is > eg "abc"
 *     so the output is "a","ab","abc","b","bc","c" >> like this we can not move backword keep forwarding 
 */

import java.util.ArrayList;

public class stringBasic {
    static ArrayList<String> substringPrint(String s){
        ArrayList<String>  newstr = new ArrayList<>();
        if(s.length() == 0){
            newstr.add("");
            return newstr;
        }
        char ch = s.charAt(0);
        ArrayList<String>  smallans = substringPrint(s.substring(1));
        for(String i :smallans){
            newstr.add(i);
            newstr.add(ch+i);
        }
        return newstr;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(substringPrint(s));
    }
}
