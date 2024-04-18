import java.util.Scanner;

class add{
    int sum(int a,int b){
        int ans = a+b;
        return ans;
    }
}


public class creatingaMethod {
    public static void main(String[] args) {

        add obj = new add();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = obj.sum(a,b);
        System.out.println(x);
    }
}
