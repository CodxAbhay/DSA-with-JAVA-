// Selction sort is a sort where we select a most least number in the array then
// we change it with the ith element in a loop start with i=0
// TIME COMPLEXITY  1. BEST, AVRAGE, WORST CASE = O(N^2) 
// SPACE COMPLEXITY = O(N)



public class Selection {
    static void SelectionSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){  // i represnet the current index  and we will go till n-2 elemnt 
            int min_Index = i;   // matlb we will find the min_index in unsorted array
            for(int j=i+1;j<n;j++){  // now start from (i+1)th element and compare with i
                if(arr[j] < arr[min_Index]){   // if array i+1 th element is less than i
                    min_Index = j;   // we will change the index of min_index to the least value Index Number
                }                    // because j will have the least value 
            }
            if(min_Index != i){
                int temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;
            }
            
        }
    }
    public static void main(String[] args) {
        int [] arr = {99,2,1,66,8,4,3,5,9,7,8,0,12,13,8888,123,865};
        SelectionSort(arr);
        for(int i : arr){   // for int i in array print array elememt 
            System.out.print(i+" ");
        }
    }
}
