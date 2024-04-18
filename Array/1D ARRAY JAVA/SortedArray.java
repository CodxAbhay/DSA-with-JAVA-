// finding sorted array     FOR ACCENDING ORDER >>> 
//   MEANS THE NEXT NUMBER MUST BE GREATER OR EQUAL TO LAST ELEMENT
// 1,2,3,4,4,4,5,5,6,7,8 >>> IS AN SORTED ARRAY

import java.util.Scanner;
public class SortedArray {

    // Making Static function to retrun true if array is an sorted order

    static boolean isSorted(int array[]){
        boolean check = true;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[i-1]){
                check = false;
                break;
            }
        }
        return check; 
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int array [] = new int[size];
        for (int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(isSorted(array));

    }
}
