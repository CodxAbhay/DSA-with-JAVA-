import java.util.Arrays;
import java.util.Scanner;

public class RrturnSmalestLargestArray {

    // Sorting Array using    Arrays.sort(array)   Method 
    static void SortedArray(int array[]){
        Arrays.sort(array);
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    // Smallest and largest elemt in array

    static int[] smallestAndlargestElement(int [] array){
        Arrays.sort(array);
        int[] ans = {array[0], array[array.length-1]};
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array>> ");
        int size = sc.nextInt();
        
        int array[] = new int[size];
        System.out.println("Enter the Element>> ");
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Sorted Array is : >> ");
        SortedArray(array);
        System.out.println("Smallest and Largest Array is ");
        int[] ans = smallestAndlargestElement(array);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
