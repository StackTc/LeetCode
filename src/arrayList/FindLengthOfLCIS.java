package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindLengthOfLCIS
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-20 20:43
 * @version: v1.0
 */
public class FindLengthOfLCIS {

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = -Integer.MAX_VALUE;
        int sum = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum++;
            } else {
                max = Math.max(max,sum);
                sum = 1;
            }
        }
        return Math.max(max,sum);
    }
}