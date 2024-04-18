// reverse the array 

import java.util.Scanner;
public class revesreArray {
    static int[] arrayreverse(int arr[]){
        int n = arr.length;
        int revArray [] = new int[n];
        int j = 0;
        for(int i = n-1;i>=0;i--){   // getting last element from array
            revArray[j++] = arr[i];
        }
        return revArray;
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
        System.out.println("Reversed array is :");
        int [] ans = arrayreverse(arry);
        for(int i = 0;i<ans.length;i++){   
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
