import java.util.Scanner;

public class CountNumber_digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original_n = n;
        int numberof_count = 0;

        while(n>0){

            n = n/10;               // 123 will become 12 and then 1 and then 0 after dividing by 10
            numberof_count++;       // example ~ 123/10 = 12 -->> 12/10 = 1 -->> 1/10 = 0
        }

        System.out.println("the number is " + original_n + " = number of count is" + numberof_count );
    }
    
}
