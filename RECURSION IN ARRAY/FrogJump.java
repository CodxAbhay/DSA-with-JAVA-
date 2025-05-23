
// lecture 36 frog question its very importent

/*  there are N stones , numbered 1,2,3....N-1 
    for each i, the height of stone i is hi. 
    there is a frog who is intially on stone 0.
    he will reapeat the following action some number of times to reach stone N-1:
    if the frog is currently on Stone i, jump to the stone i+2.
    here , a cost |hi-hj| is incurred , where j is the stone to land on.

    find the minimum possible total cost incurred before the frog reaches Stone N.
 */

public class FrogJump{

    static int best(int [] arr, int idx){
        int n = arr.length;
        if(idx == n-1) return 0;   // base case

        int firstjump = Math.abs(arr[idx] - arr[idx+1]) + best(arr, idx+1);  // this will give best value start from +1
        if(idx == n-2) return firstjump;  // because there is no any n+2 jump so returen the first jump
        int secondjump = Math.abs(arr[idx] - arr[idx+2]) + best(arr, idx+2);   // this will give best value start from +2
        return Math.min(firstjump, secondjump);
        
    }

    public static void main(String[] args) {

        int [] h = {0,2,5,6,7};

        System.out.println(best(h, 0));


        
    }
}
