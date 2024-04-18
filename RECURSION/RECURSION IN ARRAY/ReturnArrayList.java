import java.util.ArrayList;

public class ReturnArrayList {
    static ArrayList<Integer> allIndices(int [] arr, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx == arr.length){
            return ans;   // return an empty arraylist
        }

        // .add method is to add the element .
        if (arr[idx] == target){
            ans.add(idx);  // this will add the fist index in arraylist 
        }

        ArrayList<Integer> smalllans = allIndices(arr, target, idx+1);  // this will return rest of indices
        // now need to append both answer in one arraylist

        ans.addAll(smalllans);   //  .addall is method to append all the element in arraylist

        return ans;


    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,4,2,4,7,4,8};
        int target = 4;

        ArrayList<Integer> ans = allIndices(arr, target,0);

        for (Integer i : ans){   // this means that <<  for all integer i  in ans >>
            System.out.println(i);   // where (i) is a iterative 
        }
        
    }
}
