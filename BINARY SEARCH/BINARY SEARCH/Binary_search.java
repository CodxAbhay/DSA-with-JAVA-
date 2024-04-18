
/*
 * 1. Binary search is works only on sorted array
 * 2. we will find first mid and then we'll compare with target 
 * based of compare will deside where to search 
 */


public class Binary_search{
    static int bisearch(int [] arr, int target){
        int n = arr.length;
        int end = n-1;
        int start = 0;
        while (start<=end) {
            
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
       

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,15,26,47,88,99,110};
        System.out.println(bisearch(arr, 47));
        System.out.println("hello This is a index value");
       
    }
}