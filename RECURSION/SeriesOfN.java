// ading all Natural Number till given number (N)
//1-2+3-4+5-6+7........+N

import java.util.Scanner;

public class SeriesOfN {

    // main question --  alternate sum

    static int seriesSum(int n){
        if (n==0){
            return 0;
        }
        if(n%2==0){
            return seriesSum(n-1)-n;  // even case
        }
        return seriesSum(n-1)+n;   // odd case 
    }

    // basic quetion to understand how the sum works !!! ...
    // this will add 1+2+3+4+5+6.....+N 
    static int seriesSum1(int n){
        if (n==0){
            return 0;
        }
        return seriesSum1(n-1)+n;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
        System.out.println(seriesSum1(n));

    }
}
