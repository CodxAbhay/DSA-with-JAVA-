import java.util.Scanner;

public class logical_and_ifelse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a NUmber ");
        int a = sc.nextInt();
         
        if(a%2 == 0 && a%3 == 0){
            System.out.println("ans found > " + a);

        } else{
            System.out.println("not enen and also not divisible");
        }
    }
}
