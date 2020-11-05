package arrays;

import java.util.Arrays;

public class FindMaxLengthLIS {

    public static int countNumberOfLISMax(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] length = new int[n];
        int[] count = new int[n];
        Arrays.fill(length, 1);
        Arrays.fill(count, 1);
        int les = 0;

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[j] < nums[i]) {

                    if (length[i] < length[j] + 1) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if (length[i] == length[j] + 1) {
                        count[i] += count[j];
                    }


                }


            }

            les = Math.max(les, length[i]);
        }


        int lisCount = 0;
        for (int i = 0; i < n; i++) {
            if (length[i] == les) {
                lisCount += count[i];
            }
        }

        return lisCount;
    }


    public static int findNumberOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for (int i = 1; i <= nums.length - 1; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[j] < nums[i]) {
                    result[i] = Math.max(result[i], result[j] + 1);
                }

            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < result.length; i++) {

            if (max < result[i]) {
                max = result[i];
            }
        }

        return max;

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 7};
        System.out.println(findNumberOfLIS(arr));

        System.out.println(countNumberOfLISMax(arr));
    }


}
