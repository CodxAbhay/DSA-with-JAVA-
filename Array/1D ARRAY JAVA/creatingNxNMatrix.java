// Creating an NxN matrix

import java.util.Scanner;

public class creatingNxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimention of array");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.println("Enter the element in Array");
        for (int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array is: \n");
        for (int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
