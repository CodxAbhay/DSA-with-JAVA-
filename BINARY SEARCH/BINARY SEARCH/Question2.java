// find the square root of the given non negative value x.
// round it off to the nearest floor integer value.
// x = 4  ,        x = 11          x = 24
// output = 2     ,output = 3      output = 4 


public class Question2{
    static long sqrt(long x)
    {
        long st = 0, end = x;
        long ans = -1;
        while (st <=end)
        {
            long mid = st + (end-st)/2;
            long val = mid * mid; // use long here to avoid overflow
            if(val == x)
            {
                return mid;
            }else if(val < x)
            {
                ans = mid;
                st = mid+1;
            }else 
            {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long x = 25;
        System.out.println(sqrt(x));
    }
}
