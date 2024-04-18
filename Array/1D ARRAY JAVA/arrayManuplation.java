/*  find the uniqe array in a given array where 
    all the elemant are being repeted twice with one value
    being uniqe >> And also array must 
    contain only positve number 
     (IN ARRAY MUST HAVE ONLY ONE UNIQE NUMBER  ) >> NOT 2 UNIQE NUMBER
 */

import java.util.Scanner;
public class arrayManuplation {

    static int finduniqe(int [] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the elemant in array");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("uniqe elemant is : "+finduniqe(arr));

    }
    
}
