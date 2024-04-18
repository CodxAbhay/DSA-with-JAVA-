import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,4, 2, 5, 6, 2, 7, 8, 2, 5};
        int[] repeated = findRepeatedElements(arr);
        
        System.out.println("Repeated elements: " + Arrays.toString(repeated));
    }
    
    public static int[] findRepeatedElements(int[] arr) {
        Arrays.sort(arr); // Sort the array
        
        int n = arr.length;
        int repeatedCount = 0;
        
        // Count repeated elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeatedCount++;
            }
        }
        
        int[] repeatedElementsArray = new int[repeatedCount];
        int index = 0;
        
        // Store repeated elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeatedElementsArray[index++] = arr[i];
            }
        }
        
        return repeatedElementsArray;
    }
}
