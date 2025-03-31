import java.util.ArrayList;

public class exm1 {
    public static void main(String[] args) {
        int [] arr = {4,8,2,8};
        System.out.println(maximumPrimeDifference(arr));
    }
    
        public static int maximumPrimeDifference(int[] nums) {
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i<nums.length;i++){
                if(isPrime(nums[i])){
                    ans.add(i);
                }
            }
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
            for(int i = 0;i<ans.size();i++){
                if(max>ans.get(i)){
                    max = ans.get(i);
                }
                if(min<ans.get(i)){
                    min = ans.get(i);
                }
            }
            return Math.abs(max-min);
        }
        
        // Method to check if a number is prime
        public static boolean isPrime(int number){
            // Check if number is less than 2, which are not prime
            if (number < 2) {
                return false;
            }
            
            // Check for divisibility up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // If number is divisible by i, then it is not prime
                if (number % i == 0) {
                    return false;
                }
            }
            
            // If no divisors were found, the number is prime
            return true;
        }
    
    }

