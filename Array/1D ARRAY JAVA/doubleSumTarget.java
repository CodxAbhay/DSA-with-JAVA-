import java.util.Scanner;

public class doubleSumTarget {

    static int targetsum(int arr[] ,int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    ans = ans+1;
                }
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

        System.out.println("Enter the target sum ");
        int x = sc.nextInt();
        System.out.println("Your sum of given target is : "+targetsum(arr, x));

        
    }
}
