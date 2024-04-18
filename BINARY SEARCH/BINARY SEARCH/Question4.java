
// Given the roatated array of integers, which contains distinct element and an integer target,
// return the index of target if it is in the array. Otherwise return -1;
// Array = [3,4,5,1,2] , target = 4
// output = 1
// RULES   -->>
// if the arr[mid] value is less than arr[end] value then it means  between the mid to end array is sorted  
// and if above condition does not satisfy it menas oposite of that mid must be sorted 


public class Question4 {
    static int RotatedSortedArray(int [] arr, int target){
        int n = arr.length;
        int start = 0, end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if ( arr[mid] == target) return mid;
            if(arr[mid]<arr[end]){  // it means mid to end is sorted 
                if(target>arr[mid] && target <= arr[end]){ // checking that the given target is existis b/w the mid to end .
                    start = mid+1;  // if it exists b/w this array then we will search in this array by making start = mid+1
                }else{   // if target is not exist b/w mid to end then it must be in left part
                    end = mid-1;   // so this..
                }
            }else{  // it means start to mid is sorted 
                if (target >= arr[start] && target < arr[mid] ) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {3,4,5,1,2};
        System.out.println(RotatedSortedArray(arr, 2));
    }
}
