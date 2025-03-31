/*
 * A rotated sorted array is a sorted array on which roatation operation has been performeed some
 * Number of times . Given a rotated array, find the index of the minimum element in the array.
 * Follow 0-Based indexing.
 * 
 * it is guranted that all the element in the array are unique.
 * 
 * THE SOLUTION OF THIS QUESTION IS WRONG.
 */

public class Question3 {
    static int findFirstMin(int [] arr){
        int n = arr.length;
        int l =0;
        int h = n-1;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>=arr[h]){
                l = mid+1;
                ans = mid;
            }else{ 
                h = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int arr [] = {6,7,8,9,10,1,2,3,4,5};
        System.out.println(findFirstMin(arr));

    }
}
