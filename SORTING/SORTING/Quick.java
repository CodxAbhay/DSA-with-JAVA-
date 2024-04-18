
// this is also very important

public class Quick {
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);  // in this line weput the pivet eleemnt at its correct position
        int i = st, j = end;
        while(i < pivotIdx && j > pivotIdx){  // now its line we are making less than pivot in left 
            /// and greater than pivot in right side 
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 6, 3, 1, 5, 5, 4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting"); // 1 3 4 5 6
        displayArr(arr);
    }
}