/**
 * Given an array of integers nums and an integer threshold, we will choose a positive integer divisor and divide all the array by it and sum the result of the division. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
 *
 * Each result of division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
 *
 * It is guaranteed that there will be an answer.
 * EXAMPLE:
 *
 * Input: nums = [1,2,5,9], threshold = 6
 * Output: 5
 * Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
 * If the divisor is 4 we can get a sum to 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
 *
 */

public class SmallestDivisor {

    public static void main(String[] args) {
        int[]nums={2,3,5,7,11};
        int threshold=11;

        System.out.println(smallestDivisor(nums,threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 1000001;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            long sum = getSum(nums, mid);
            if(sum > threshold)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return l;
    }

    private static long getSum(int[] nums, int d) {
        long sum = 0;
        for(int num : nums)
            sum += (num - 1) / d + 1;
        return sum;
    }
}
