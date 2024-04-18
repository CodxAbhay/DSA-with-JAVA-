public class addingNum {
    static int SumOfNum(int n ){
        if(n>=0 && n<=9){
            return n;
        }
        return SumOfNum(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(SumOfNum(123456789));
    }
}


// for exmalple if we add n = 1234 
// then we will get and = 10