import java.util.Scanner;

public class TriplateSumTarget {
    static int triplatesum(int [] arr,int x ){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+ arr[j] + arr[k] == x){
                        sum++;
                    }
                       

                }
            }
        }
        return sum;
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

        System.out.println("Enter the target sum ");
        int x = sc.nextInt();
        System.out.println("The triplate sum of give target is: "+triplatesum(arr, x));
    }
}
