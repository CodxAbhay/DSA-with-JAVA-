
// lecture number 35 for better understanding of this code 
// printing all posible sum subset of given array

public class SumOfAllSubset {
    static void sumSubset(int[] a, int idx, int sum){
        if(idx >= a.length){
            System.out.println(sum);
            return;
        }
        sumSubset(a, idx+1, sum); // do not including the current sum 
        sumSubset(a, idx+1, sum + a[idx]);  // including the current sum
    }
    public static void main(String[] args) {

        int [] arr = {2,4,5};
        sumSubset(arr, 0, 0);
    }
}
