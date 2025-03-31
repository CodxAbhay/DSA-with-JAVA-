
// printing the value of arraay

public class printArray {
    static void printingArray(int [] arr, int idx){
        int n = arr.length;
        if (idx == n){   //  base case to terminate the recursive loop 
            return;
        }
        System.out.println(arr[idx]);  // self work to print the given arr index 
        printingArray(arr, idx+1);    // recusive work to print arr from index+1 to last
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        printingArray(arr,0);
        
    }    
}
