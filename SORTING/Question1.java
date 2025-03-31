
// the question is about to move all zero's in last but the order of non zero 
// should not be changed for eg.  INPUT = 0 3 1 0 2 5  >>> OUTPUT =  3 1 2 5 0 0

public class Question1 {
    public static void main(String[] args){
        int [] arr = {0,3,1,0,2,5};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] == 0 && arr[j+1] != 0){  // if this iz correct , it means numbers is not in correct order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
}
