/* Given an array of size N containing only,
   0s , 1s and 2s : Sort the array in the ascending order
   arr[] = {0,2,1,2,1,0,0,1,0,2} 
   Output: {0,0,0,0,1,1,1,2,2,2}
 */


public class Question5 {
    static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int arr[]){
        int n = arr.length;
        int low=0, high = n-1 , mid = 0;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if (arr[mid]==1){
                mid++;
            }else{   /// this will check if arr[mid] == 2 then it must go in last and then last(high --)
                swap(arr, mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {

        int arr [] = {0,2,1,2,0,1,1,2,0};
        sort012(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

        
    }
}
