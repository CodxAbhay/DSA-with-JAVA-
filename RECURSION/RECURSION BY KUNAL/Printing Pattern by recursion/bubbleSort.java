import java.util.Arrays;

public class bubbleSort {
    static void bubble(int [] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            if(arr[col] > arr[col+1]){
                // swap then
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr, row, col+1);
        }else{
            bubble(arr, row-1, 0);
        }

    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,0,1,5,2};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }    
}
