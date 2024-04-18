// Rotate the given array 'a' by k steps where k in non-negative.
// also K can be greater than n as well
// where n is the size of array 
// k = 0   >>> Arr = [1,2,3,4,5]  MEans Same array at K =0
// k = 1   >>> Arr = [5,1,2,3,4]
// k = 2   >>> Arr = [4,5,1,2,3]
// k = 3   >>> Arr = [3,4,5,1,2]
// k = 4   >>> Arr = [2,3,4,5,1]
// k = 5   >>> Arr = [1,2,3,4,5]  Same as k=0 


// >> simlaraly if you rotate array at k==n times you will get same array 
// >>> and also if you further rotate arr then you again will get array from k=1
// >>> So formula of roating is --> k = k%n;   n = arr.length

import java.util.Scanner;

public class RotateArray {

    static int [] Rotate(int arr[] ,int k){
        int n = arr.length;
                         // it will tell you the exact roation Even if u give 1001 
        k = k % n;      // it means 1001%5 = 1 so it will roatate onlay one time
        int j = 0;
        int ans[] = new int[n];     // creating an new array 
                                   // suppose n=5 (element) and >> k =3 (times rotate)
        for(int i=n-k;i<n;i++){     // statring from n-k it means >> 5-3 = arr[2] so it will add elemnt in new array from index 3 to n-1
            ans[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++){    // And then here we add rest of element in last 
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arry[] = new int[n];
        System.out.println("Enter the  elemment in an array");
        for(int i = 0;i<arry.length;i++){
            arry[i] = sc.nextInt();
        }
        System.out.println("Enter the number of roation , want to roatate :");
        int a = sc.nextInt();
        System.out.println("Original Array :: ");
        printArray(arry);
        int newarray [] = Rotate(arry, a);
        System.out.println("After roating Array is: >> ");
        printArray(newarray);
    }
}
