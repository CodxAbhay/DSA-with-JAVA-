import java.util.Scanner;

public class ReverseANumber {
    public static int reverse(int n){
        if(n%10 == n){
            return n;
        }
        int num = n%10;
        System.out.print(num);
        return reverse(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse and cheack for the plindrom");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
