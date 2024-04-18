
// here we will do merge sort using the recursion

import java.util.Arrays;

public class MergeSort {
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        // now calculate the mid and divide the 
        // array in two parts and ask to the recursion to make the each part sorted
        int mid = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    
    // making the method merge for merging the both the  sorted array 

    static int [] merge(int [] left , int [] right){
        // making the new array for storing the value 
        int [] newarr = new int[left.length+right.length];

        // i , j for the left and the right array
        int i = 0;
        int j = 0;
        // k for newarr to fill the value in the array
        int k = 0;

        // now make a condition where we will filling the value in newarr untill 
        // any of the array is not finished
        while (i<left.length && j<right.length) {

            if(left[i] < right[j]){
                newarr[k] = left[i];
                i++;
            }else{
                newarr[k] = right[j];
                j++;
            }
            k++;
        }

        // after filling the array lets cheack if any of left and right array
        // have any value then just simply add to the new array

        while(i<left.length){
            newarr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            newarr[k] = right[j];
            k++;
            j++;
        }
        return newarr;

    }
    public static void main(String[] args) {
        int [] arr = {8,5,0,12,87,4,88};
        int [] ans = mergeSort(arr);
        for(var i : ans){
            System.out.print(i+" ");
        }
    }
}
