// this will give you a (n) times multiple of given number 
// print table of given number n  at m times

import java.util.Scanner;

public class multiple_Of_Num {
    static void multipleOfNumber(int n, int m){
        if(m==1){
            System.out.println(n);
            return;
        }
        if(m==0){
            System.out.println(0);
            return;
        }
        multipleOfNumber(n, m-1);
        System.out.println(n*m);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        multipleOfNumber(n, m);

    }

}
