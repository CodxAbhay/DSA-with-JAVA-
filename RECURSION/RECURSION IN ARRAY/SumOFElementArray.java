
// here we are going to find the sum of all the alement in a given array


public class SumOFElementArray {
    static int sumofarray(int [] arr, int idx){
        if (idx == arr.length){  // base case to terminate the infinit recursion
            return 0;
        }
        return sumofarray(arr, idx+1) + arr[idx];  // 
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        System.out.println(sumofarray(arr, 0));
        
    }
}
