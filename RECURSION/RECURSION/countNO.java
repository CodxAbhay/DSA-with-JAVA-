// counting number in given number using recursion 
// using 1+ to add the number and using n/10
// to find first n-1 number 


public class countNO {
    static int count(int n){
        if (n>=0 && n<=9){
            return 1;
        }else{
            return 1+count(n/10);  // because 123/10 = 12  ,  12/10=1  
        }
    }
    public static void main(String[] args) {
        System.out.println(count(1234));
    }
}
