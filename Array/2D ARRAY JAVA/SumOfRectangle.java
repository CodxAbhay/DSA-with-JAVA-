// ENter the row and column for 1 matrix: 
// 3 3
// Enter the 9 elements
// 1 2 3
// 2 1 1
// 1 2 1
// Enter the baundries of rectange sum l1 , r1 , l2, r2 :
// 0 0 2 2 
// Sum from rectangle 14
// SUM OF GIVEN RECTANGLE IS :: 14




import java.util.Scanner;

public class SumOfRectangle {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    // calculate row wise and column wise prefix sum 
    static void prifixSum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        // traverse horijonatly to find row wise prifix sum 
        for(int i =0;i<r;i++){
            for(int j=1;j<c;j++) {
                arr[i][j] += arr[i][j-1];

            }
        }
        // traverse verticallay to find column wise prefix sum
        // matrix [i][j] = sumOfDigonal( (0,0 )  (i,j) )
        for(int j=0;j<c;j++){  // fixing column 
            for(int i=1;i<r;i++){   //  traversing all row thorw this fixed column
                arr[i][j] += arr[i-1][j];
            }
        }
    }


    static int SumofRectangle(int arr[][],int l1,int r1,int l2 ,int r2){
        int sum =0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int SumOfRectangle2(int arr[][],int l1,int r1,int l2 ,int r2){
        int ans = 0 ,sum = 0,up=0,left = 0,upLeft=0;
        prifixSum(arr);
        sum = arr[l2][r2];
        if(r1>=1)
            left = arr[l2][r1-1];
        if(l1>0)
            up = arr[l1-1][r2];
        if(l1>0 && r1>0)
            upLeft = arr[l1-1][r1-1];

        ans = sum-up-left+upLeft;

        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the row and column for 1 matrix: ");
        int row = sc.nextInt(); 
        int column = sc.nextInt(); 
        System.out.println("Enter the " +row*column + " elements");
        int [] [] array = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                array [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the baundries of rectange sum l1 , r1 , l2, r2 :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum = SumofRectangle(array, l1, r1, l2, r2);
        System.out.println("Sum from rectangle "+SumOfRectangle2(array, l1, r1, l2, r2));
        System.out.println("SUM OF GIVEN RECTANGLE IS :: "+sum);

    }
}
