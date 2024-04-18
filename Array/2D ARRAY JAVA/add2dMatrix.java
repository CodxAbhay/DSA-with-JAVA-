import java.util.Scanner;

public class add2dMatrix{
   
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void addMatrix(int arr[][],int row1 , int column1 ,int arr2[][],int row2,int column2){
        if(row1!=row2 || column1!=column2){
            System.out.println("Not possible to add ");
            return;
        }
        int [][] sum = new int[row1][column1];
         for(int i =0;i<row1;i++){              // row element 
            for(int j = 0;j<column1;j++){      // column element 
                sum [i][j] = arr[i][j] +arr2[i][j]; 
            }
        }
        printMatrix(sum);
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
        System.out.println("Entered matrix 1 is :");
        printMatrix(array);
        System.out.println("Entered matrix 2 is :");
        printMatrix(array1);
        System.out.println();
        System.out.println("After adding matrix :: ");

        addMatrix(array, row1, column1, array1, row1, column1);
    }
}