// finding   p^q 

      
public class FindPower {
    static int pow(int p , int q){   // Time Compl.. = o(n)
        if (q==0){
            return 1;
        }
        return pow(p, q-1)*p;   // p x p^(q-1) x p
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 1));
    }
}
