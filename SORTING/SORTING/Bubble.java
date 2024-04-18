/* BUBBLE SORT ALGO ..>>  we do certain no. (n-1) of passes in every pass , 
 we compare adjancent element and swap them if they are not in correct order.
TIME COMPLEXITY >> 1. Best case o(N)  2. Average case o(N^2)  3. worst case o(N^2)
SPACE COMPLEXITY >>  o(1) */

public class Bubble {
    static void BubbleSort(int [] a){
        int n = a.length;
        for(int i = 0 ; i<n-1; i++){
            boolean flag = false;   
            for(int j=0;j<n-i-1;j++){   //last i element is already in correct order so no  need to check them so usnig n-i-1 */
                 if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                 }
            }
            if(flag == false)
            {  // for optimizing the best case 
                return;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {9,6,5,3,1,0};

        BubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
