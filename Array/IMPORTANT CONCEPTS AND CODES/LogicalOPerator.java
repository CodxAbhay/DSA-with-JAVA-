public class LogicalOPerator {
    public static void main(String[] args) {
        int a = 3, b = 55 , c = 4;

        System.out.println((a>b) && (a<c));
        System.out.println((a<b) && (b>c));
        System.out.println((a>b) || (a<c));
        System.out.println((a<b) || (a>c));
        System.out.println(!(a>b));
        System.out.println(!(a==b));
        System.out.println(!(a!=b));
    }
}
