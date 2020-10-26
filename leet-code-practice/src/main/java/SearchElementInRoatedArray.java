public class SearchElementInRoatedArray {


    public static void main(String[] args) {
        int [] a={5,6,7,8,9,1,2,3,4};

        int start=0;
        int end=a.length-1;
        int resultedIndex=findElement(a,start,end,9);
        System.out.println(resultedIndex);
    }

    private static int findElement(int[] nums,int start,int end,int target) {
        while (start<=end){

            int mid=(start+end)/2;
            if (nums[mid]==target) return mid;
            if (nums[mid]>=nums[start]){
                if (target>=nums[start] && target<nums[mid]) end=mid-1;
                else start=mid+1;
            }else {
                if (target<=nums[end] && target>nums[mid]) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }

    }

