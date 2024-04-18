import java.util.Scanner;

public class Arrayimp{

    // it will tell the last index of x which is present in arry[]

    static int lastoccrance(int arry[] ,int x){
        int last = -1;
        for (int i = 0; i<arry.length;i++){
            if(arry[i] == x){
                last = i;
            }
        }
        return last;
    }
    // THIS WILL TELL COUNT THE NUMBER OF ARRAY IF ANY ARRY ELEMANT IS GREATER THAN X

    static int GreaterThanX(int arry[] ,int x){
        int last = 0;
        for (int i = 0; i<arry.length;i++){
            if(arry[i] > x){
                last++;
            }
        }
        return last;
    }
// THIS WILL COUNT THE NUMBER OF OCCUANCE WHICH IS PRENST IN AN ARRAY 

    static int countOccurance(int array[] , int x){
        int count = 0;
        for (int i = 0;i<array.length;i++){
             if(array[i] == x){
                count++;
             }
        }
        return count;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1d array");
        
        // TAKING SIZE OF ARRAY
        int size = sc.nextInt();

        // CREATING AN ARRAY WITH SIZE
        int [] array = new int[size];
        System.out.println("enter the elemnts of array");
        for (int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("last index of given x is : " + lastoccrance(array, x));
        System.out.println("Count of x in array is  : " + countOccurance(array, x));
    }
}