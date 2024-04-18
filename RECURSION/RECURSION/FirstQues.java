// finding factorial of 5 


public class FirstQues{
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        
        // calling recursive funtion 
        
        System.out.println(fact(5));
        
       

    }
}