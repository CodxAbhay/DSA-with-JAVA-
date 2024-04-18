
import java.util.Scanner;

public class ReaCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a character: ");

        char ch = sc.next().charAt(0);
        // System.out.println(sc);
        System.out.println("Character is : " + ch);
    }
}
