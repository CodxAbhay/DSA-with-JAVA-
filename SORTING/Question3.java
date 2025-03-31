
// Given an array where all its elements are sorted in increasing order
// except two swaped element , sort it in linear o(n) Assume there is no duplicate element 


public class Question3 {

    static void sort(int [] arr){
        int n = arr.length;
        int x=-1;
        int y=-1;
        if(n<=1) return;  // corner case handling
        // process all adjacent element 
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){   // fist conflict
                    x=i-1;  //  found the fist index where the elemnt is not in correct order
                    y=i;   // we also added y=i so that to handle the case if a array have only two element 
                }else{  // 2nd conflict 
                    y=i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;


    }
    public static void main(String[] args) {
        
        int arr [] = {3,8,6,7,5,9,10};
        sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    
}
