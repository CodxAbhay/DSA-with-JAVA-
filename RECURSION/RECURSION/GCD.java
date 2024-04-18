// IN THIS PROBLEM WE WILL FIND GCD OF GIVEN NUMBER 
// using    **Ecluid's Algo**   we know that  gcd(x,y) == gcd (y,x%y)

// gcd is basically  called HCF or the LCM of both number 


import java.util.Scanner;

public class GCD {

    // Using recursion finding Gcd

    static int RGCD(int x , int y){
        if (y==0){
            return x;
        }
        return RGCD(y, x%y);
    }

    // using loops to find the GCD ( Greatest Common Divisible )
    static int iGcd(int x , int y){
        while(x%y != 0){
            int remn = x%y;
            x = y;
            y = remn;
        }
        return y;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(iGcd(m,n));
        System.out.println(RGCD(m,n));
    }
}
