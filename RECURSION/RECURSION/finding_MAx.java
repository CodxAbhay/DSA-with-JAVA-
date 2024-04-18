
// finding the maximum number in given array


public class finding_MAx {

    static int maxarr(int [] arr , int idx){
        if (idx == arr.length-1){  //  base case to terminate the infinite recurion 
            return arr[idx];
        }

        int smallans = maxarr(arr, idx+1);   // recursive work
        return Math.max(arr[idx], smallans);  // self work >> comparing the arr with current index and small answer

    }
    public static void main(String[] args) {
        int [] arr = {12,32,4,55,3,21};
        System.out.println(maxarr(arr,0));  // here we are given index 0 because we want to compare form 0
    }
}
