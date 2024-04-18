// Swaping array element in reverse order by using methods


import java.util.Scanner;

public class ReverseWithoutAdditionalArgu {
    static void Spawarray(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void revarray(int arr[]){
        int i =0 , j=arr.length-1;
        while(i<j){
            Spawarray(arr, i, j);
            i++;
            j--;
        }
        // printing the array
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
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
        System.out.println("Your Reverse Array is : ");
        revarray(arry);
    }
}
