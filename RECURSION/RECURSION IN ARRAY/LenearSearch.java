
// applying lenear search using recursion .. 

public class LenearSearch {
  
    // printing all indices of trageted value in array

    static void FindAllIndices(int [] arr, int target , int idx){
        if (idx == arr.length){
            return;
        }
        if(arr[idx] == target){
            System.out.println(idx);
        }
        FindAllIndices(arr, target, idx+1);
    }

    // returing true or false ,, depending on target
    
    static boolean search(int [] arr, int target, int idx){
        // base case 
        if (idx == arr.length){
            return false;
        }
        // self work 
        if(arr[idx] == target){
            return true;
        }
        // recusive work 
        return search(arr, target, idx+1);
    }
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        // System.out.println(search(arr, target, 0));

        if (search(arr, target, 0)){
            System.out.println("YES FOUND ");
        }else{
            System.out.println("NO NOT FOUND ");
        }

    }
}
