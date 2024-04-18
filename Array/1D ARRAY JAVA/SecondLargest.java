// finding second largest element from any given array
// HERE WE WILL USING THE VALUSE OF INTEGER TO FIND THIS
//        int intger = Integer.MIN_VALUE;   >>> to find the Largest Element in Array
//         int intger = Integer.MAX_VALUE;  >>> to find the Smallest value in Array 
// ASA

import java.util.Scanner;

public class SecondLargest {
    // finding the maximum value in given array>>

    static int findMaximum(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];    // found maximum value  
            }
        }
        return max;
    }
    static int FindSecondMax(int arr[])
    {
        int max = findMaximum(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMaximum(arr);
        return secondMax;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The second maximun number of array is: "+FindSecondMax(arr));
    }
    
}
