package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindUnsortedSubarray
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2018-12-31 18:07
 * @version: v1.0
 */
public class FindUnsortedSubarray {

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        System.out.println(findUnsortedSubarray(nums));
    }

    /**
     * I use the variables beg and end to keep track of minimum subarray A[beg...end] which must be sorted for the entire array A to be sorted.
     * If end < beg < 0 at the end of the for loop, then the array is already fully sorted.
     * @param nums
     * @return
     */
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length, beg = -1, end = -2, min = nums[n-1], max = nums[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-1-i]);
            if (nums[i] < max) end = i;
            if (nums[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }
}