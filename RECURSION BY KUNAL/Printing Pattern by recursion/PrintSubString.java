
// make a tree to understand this question very well;
// You will given to a string print all the substring of the string

import java.util.Arrays;
public class PrintSubString {
    static void substring(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        substring(str.substring(1), ans+ch); // ading the char to a string
        substring(str.substring(1), ans);  // not adding the char to a string 
    }


    public static void main(String[] args) {
        substring("abc", "");
        int[] arr = {1,2,3};

        // so when you will convert a array to string that will contain the --> , [] space 
        String str = Arrays.toString(arr).replaceAll("[\\[\\], ]", ""); // Remove brackets, commas, and spaces
        // .relpaceAll will remove everything that you will provide in the regex 
        //and at the removed place the thing that you will give in the 'replacement' will add at the removed place
        substring(str, "");
    }
}
