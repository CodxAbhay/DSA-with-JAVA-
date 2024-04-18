// not working till now




import java.util.Scanner;

public class ReverseOFRow {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[][] rev(int arr[][],int r,int c)
    {
        // int array[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
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

        int arr [][] = rev(array, row, column);
        printMatrix(arr);
    }
}
