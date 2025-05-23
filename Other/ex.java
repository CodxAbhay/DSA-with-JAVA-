
// this is genrating the passcal trangle of any row;

import java.util.*;

public class ex {
    public static ArrayList<Integer> genrateRow(int row){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        int temp = 1;
        for(int i = 1; i<row; i++){
            temp = temp*(row-i);
            temp = temp/i;
            ans.add(temp);
        }
        return ans;
    }

    // to store in the List<List<Integer>> the whole passcal trangle with given row
    public static List<List<Integer>> Pascal(int row){

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();

        for(int i = 1; i<=row; i++){
            rows = genrateRow(i);
            ans.add(rows);
        }

        return ans;
        
    }
    

    public static void main(String[] args) {
        // ArrayList<Integer> row = genrateRow(5);
        List<List<Integer>> pascall = Pascal(5);

        System.out.println(pascall);
    }
}
