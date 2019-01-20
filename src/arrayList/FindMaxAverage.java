package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindMaxAverage
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-20 19:37
 * @version: v1.0
 */
public class FindMaxAverage {

    public static void main(String[] args) {
        int[] nums = {};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i - k >= 0) {
                sum -= nums[i - k];
            }

            if (i - k >= 0 || i + 1 - k == 0) {
                max = Math.max(max,sum);
            }
        }

        return max / k;
    }
}