/*
 * Search element in rotated sorted array with duplicate elements. Retrun true if the element is found.else return false.
 * Arr = {0,0,0,1,1,2,0,0,0} target = 2
 * output = true
 */

public class Question5 {
    static int roatated(int[] arr, int target){
        int n = arr.length;
        int start = 0 , end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // this while condition will eleminate reapeted element
            while (arr[start] == arr[mid] && arr[mid] == arr[end]) {  
                start++;
                end--; 
            }
            if(arr[mid] == target) return mid;
            else if (arr[mid] <= arr[end]){  // right array is sorted form mid even if arr[mid] == arr[end] 
              //                              // Because if even they are equal , the pivot elemnt will not be b/w it.
                if(target>arr[mid] && target<=arr[end]){  
                    start = mid+1;
                }else{  
                   end = mid-1; 
                }
            }else{  // left array is sorted from mid
                // agin check if target is present in b/w the sorted array
                if(target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }else start = mid+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int [] Arr = {1,1,1,1,1,1,2,2,2,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(roatated(Arr, 2));
         
    }
}

