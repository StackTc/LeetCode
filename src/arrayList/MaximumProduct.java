package arrayList;

import java.util.Arrays;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: MaximumProduct
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-01 22:08
 * @version: v1.0
 */
public class MaximumProduct {

    public static void main(String[] args) {

    }

    /**
     * 找出3个数，乘积最大值，正常情况下 数组中最大的3个数相乘就是最大，
     * 排除，比较小的2个是负数的情况，比如  -8，-7，1，2，3 那么 -8 * -7 * 3 才是最大
     * 所以最后拿这2个值比较一下，单排序导致时间复杂度变大，所以最好 遍历找出最大的3个值，最小的2个值。
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int max1 = nums[length - 1] * nums[length - 2] * nums[length - 3];

        int max2 = nums[0] * nums[1] * nums[length - 1];
        return Math.max(max1, max2);
    }
}