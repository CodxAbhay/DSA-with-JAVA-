import java.util.Scanner;

public class if_else2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your choice 1 or 0 ");
        int num = sc.nextInt();

        String chanchal;
        chanchal = (num == 1) ? "chanchal will come" : "chanchal will not come" ;
        System.out.println(chanchal);
    }
}
