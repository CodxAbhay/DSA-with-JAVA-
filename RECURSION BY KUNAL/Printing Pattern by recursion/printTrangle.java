
public class printTrangle {

    /*  to print * * * * 
//              * * * 
//              * * 
//              * 
 */
    static void print(int n){
        if(n == 0){
            return;
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print("* ");
        }
        System.out.println();
        print(n-1);
    }

    // to print its reverse 
    /*  to print 
    //           * 
    //           * * 
    //           * * * 
    //           * * * * 
 */

 /*
  * and when you combine both of then togather
  */
    static void print2(int n){
        if(n == 0){
            return;
        }
        print2(n-1);
        for(int i = 0 ; i<n ; i++){
            System.out.print("* ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        print(4);
        print2(4);
    }
    
}
