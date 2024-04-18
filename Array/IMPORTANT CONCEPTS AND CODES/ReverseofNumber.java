import java.util.Scanner;

public class ReverseofNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int revers_num = 0;
        while(n>0){
            
            revers_num = revers_num*10 + n%10;
            n = n/10;
        }
        System.out.println("the reverse number is " + revers_num);
    }
}
