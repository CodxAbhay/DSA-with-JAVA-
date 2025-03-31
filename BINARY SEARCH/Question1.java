/*
 * find the first uccurence of a given element x , given that the given array is SORTED ,
 * if no uccurence of given x is found then return -1.
 * arr = {2,5,5,5,6,7,9,9,10}  , x =5
 * Output = 1(Index).  1st uccurence of 5 
 * 
 * formula is to find this >> high = mid-1;
 */

public class Question1 {
    static int Return1st(int [] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int fo = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == x){
                fo = mid;
                high = mid-1; // we using this line so that we can find the 1st index of given x till the 0th index
                // simlaraly if we want to find the last index of x then we can use [ low = mid+1 ] so that we can go until the last index
            }else if(x>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,5,5,6,7,8,9,9,9,9};
        int x = 5;
        System.out.print(Return1st(arr, x));
    }
}
