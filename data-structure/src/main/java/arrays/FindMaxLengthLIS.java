package arrays;

import java.util.Arrays;

public class FindMaxLengthLIS {

    public static void main(String[] args) {
        int []arr={1,3,-5,4,-7};
        System.out.println(findNumberOfLIS(arr));
    }

    public static int findNumberOfLIS(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,1);

        for(int i=1;i<=nums.length-1;i++){

            for(int j=0;j<i;j++){

                if(nums[j]<nums[i]){
                    result[i]=Math.max(result[i],result[j]+1);
                }

            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<result.length;i++){

            if(max<result[i]){
                max=result[i];
            }
        }

        return max;

    }
}
