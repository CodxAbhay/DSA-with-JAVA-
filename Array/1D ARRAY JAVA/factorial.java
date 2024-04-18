import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long N = scanner.nextLong();


        long multiplesOf3 = 0;
        long multiplesOf5 = 0;

        for (long i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                multiplesOf3++;
            }
            if (i % 5 == 0) {
                multiplesOf5++;
            }
        }

        long totalMultiples = multiplesOf3 + multiplesOf5;

        System.out.println(totalMultiples);

        //scanner.close();
    }
}
