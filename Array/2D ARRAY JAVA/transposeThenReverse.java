/*
   Transpose the matrix then reverse it column from first to last 
 */


import java.util.Scanner;

public class transposeThenReverse {
    static void printMatrix(int array [][]){
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transeposeInPlace(int arr [][],int r,int c){
        for(int i =0;i<r;i++){
            for(int j=i;j<c;j++){         // here we will start this loop from (i) because then our transepose will possiable
                // swaping the element position   // but this can possiable only for sqare matrix

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // printMatrix(arr);
    }

    // this method is reverseing the element in an 1D array
    static void Reverse(int arr[]){
        int i =0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    static void TransReverse(int arr[][],int r,int c){
        // first step is to transpose the matrix t

        transeposeInPlace(arr, r, c);
          /*
            second step is to rotate the matrix -->> 
             1 2 3
             4 5 6
             7 8 9

             in this matrix -->> at    i=0  >> means    1 2 3    element 
             in this matrix -->> at    i=1  >> means    4 5 6    element 
             in this matrix -->> at    i=2  >> means    7 8 9    element
             so here we going to use only one loop to get 1d array and rotate it
             */

        for(int i =0;i<r;i++){
            Reverse(arr[i]);      
        }
        printMatrix(arr);    }


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
        TransReverse(array, row, column);

    }
}
