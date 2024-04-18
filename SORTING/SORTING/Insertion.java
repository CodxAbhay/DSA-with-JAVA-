
/*Take one element form unsorted part , and itreate through through sorted part 
And find the correct position this elemnt and put it  
*/


public class Insertion {
  static void InsertionSort(int [] arr){
    int n = arr.length;
    for(int i = 1 ; i<n-1 ; i++){
      int j = i;
      while (j>0 && arr[j] < arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
  }

    public static void main(String[] args) {
        int [] arr = {5,1,88,3,9,4,2,6,11,4,7,10};
        InsertionSort(arr);
        for(int i : arr){
          System.out.print(i+" ");
        }
    }
}
