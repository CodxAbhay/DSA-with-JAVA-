/*
 * This is a binary search using recursion 
 */

public class Binary_UsingRecursion {
    static boolean RecBinary_search(int [] arr,int low, int high , int target){
        while(low<high){
            int mid = (low+(high-low)/2);
            if(arr[mid] == target){
                return true;
            }
            else if(target >arr[mid]){
                return RecBinary_search(arr,mid+1,high, target);
            }
            else{
                return RecBinary_search(arr, low, mid-1, target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = { 1,2,3,10,15,30,45,55,89,90};
        System.out.println(RecBinary_search(arr, 0, arr.length-1, 3));
    }
    
}
