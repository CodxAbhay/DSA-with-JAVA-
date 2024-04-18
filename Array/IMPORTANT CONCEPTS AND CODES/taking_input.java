
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your lucy number");
        int num_1 = sc.nextInt();
        System.out.println("Lucy number is " + num_1);

        System.out.println("enter your Name>>");
        String name = sc.nextLine();
        System.out.println("your name is: " + name);

    }
}