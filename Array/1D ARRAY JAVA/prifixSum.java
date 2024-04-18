// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class prifixSum {

   static void printArr(int[] arr) {
      for(int i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();
   }

   static int[] frefixSum(int[] arr) {
      int n = arr.length;

      for(int i = 1; i < n; ++i) {
         arr[i] = arr[i]+arr[i-1];
      }

      return arr;
   }

//    static int[] postfixSum(int[] arr) {
//       int n = arr.length;
//       int j = 0;

//       for(int i = n - 2; i > 0; --i) {
//          arr[j++] = arr[i] + arr[i - 1];
//       }

//       return arr;
//    }

   public static void main(String[] arr) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int n = sc.nextInt();
      int[] array = new int[n];
      System.out.println("Enter the  elemment in an array");

      for(int i = 0; i < array.length; ++i) {
        array[i] = sc.nextInt();
      }

      int[] arry = frefixSum(array);
      printArr(arry);
   }
}
