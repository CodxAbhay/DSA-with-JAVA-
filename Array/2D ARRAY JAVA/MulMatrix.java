import java.util.Scanner;

public class MulMatrix {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void printMatMul(int a[][],int r1,int c1,int b[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Matrix multiplication is not possiable >> give c1 == r1");
            return;
        }
        int mul[][] = new int[r1][c2];
        for(int i =0;i<r1;i++){         // row number 
            for(int j =0;j<c2;j++){    // column number

                for(int k =0;k<c1;k++){    // loop for multiply and add >> it will run till c1 or r1
                /*
                    mul[i][j] = Ith row of a * Jth col of b
                */
                    mul[i][j] =  mul[i][j]+(a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("multiplication of 2 matrices :");
        printMatrix(mul);
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
        System.out.println("ENter the row and column for 2 matrix: ");
        int row1 = sc.nextInt(); 
        int column1 = sc.nextInt(); 
        System.out.println("Enter the " +row1*column1 + " elements");
        int [] [] array1 = new int[row1][column1];
        int a = array.length;
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<column1;j++){
                array1 [i][j] = sc.nextInt();
            }
        }

        printMatMul(array, row, column, array1, row1,column1);
        
    }
}
