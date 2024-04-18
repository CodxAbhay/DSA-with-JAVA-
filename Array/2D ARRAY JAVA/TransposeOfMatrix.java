import java.util.Scanner;

public class TransposeOfMatrix {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();      
        }
    }
    // this is giving error in non sqaure matrix
    static int [][] transpose(int arr[][],int r,int c){
        int trans [][] = new int[c][r];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[i][j] = arr[j][i];     // we adding first j then i because we just need to change the i,j place to j,i to make 
                                             // anyone matrix into transpose matrix
            }
        }
        return trans;
    }
//   only for square matrix
// transposing array without creating an extra array -->> inplace transpose
    static void transeposeInPlace(int arr [][],int r,int c){
        for(int i =0;i<r;i++){
            for(int j=i;j<c;j++){         // here we will start this loop from (i) because then our transepose will possiable
                // swaping the element position   // but this can possiable only for sqare matrix

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr);
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

        System.out.println();
        System.out.println("Transpose of matrix is: ");
        int arr [][] = transpose(array, row, column);
        printMatrix(arr);

        System.out.println();
        // transeposeInPlace(array, row, column);
        transpose(arr, row, column);
        
    }
}



// FOR INPLACE TRANSPOSE IN NON SQUARE MATRIX
// ENter the row and column for 1 matrix: 
// 2 3
// Enter the 6 elements
// 1 2 3
// 4 5 6

// Transpose of matrix is:
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//         at TransposeOfMatrix.transeposeInPlace(TransposeOfMatrix.java:31)
//         at TransposeOfMatrix.main(TransposeOfMatrix.java:58)