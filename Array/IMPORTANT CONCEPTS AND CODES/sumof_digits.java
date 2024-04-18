import java.util.Scanner;

public class sumof_digits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original_n = n;
        int sum_ofDigits = 0;
        while(n>0){

            sum_ofDigits += n%10;   // by using n%10 it will give us only last digits 
            n = n/10;               // for ex.1 1234%10 = 4 -->> ex.2 -->> 435%10 = 5

            
        }

        System.out.println("digits is " + original_n + " and the sum is = " + sum_ofDigits);

    }
}
