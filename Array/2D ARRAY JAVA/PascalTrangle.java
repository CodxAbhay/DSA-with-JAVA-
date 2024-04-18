// printing the pascal traingle

// Enter the element :  7
// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 
// 1 5 10 10 5 1 
// 1 6 15 20 15 6 1 


import java.util.Scanner;

public class PascalTrangle {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n ){
        int[][] ans = new int[n][];
        for(int i = 0;i<n;i++){

            // ith row has i+1 columns 
            ans [i] = new int[i+1];
            
            // first ans last element of every element is one 
            ans[i][0] = ans[i][i] = 1;

            // adding most upper and most left upper value to create new element

            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printMatrix(ans);
        
    }
}
