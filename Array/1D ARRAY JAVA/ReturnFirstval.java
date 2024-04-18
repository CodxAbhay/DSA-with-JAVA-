// Given a array consisting of positive intgers 
// retrun first value that is repeating in this array
// if not repeating then return -1

import java.util.Scanner;

public class ReturnFirstval {

    static int firstValRepeat(int arr[]){
        
        for(int i =0;i<arr.length;i++){    // first number 
            for(int j=i+1;j<arr.length;j++){   // second number
                if(arr[i] == arr[j]){
                    return arr[i];  // whhen we use retrun in any conditional expration then 
                }                   // then after getting first value of given condition it STOPS WHOLE LOOP AND CONDITION
            }                       // so we don't need to use break statement 
        }
        return -1;
    }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the element in array");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The first repeating value in Array is : "+firstValRepeat(arr));
    }

}
