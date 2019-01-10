package hashtable;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindErrorNums
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-10 22:51
 * @version: v1.0
 */
public class FindErrorNums {

    public static void main(String[] args) {
        int[] test = {1,1};

        findErrorNums(test);
    }

    /**
     * 这种时间复杂度不对，因为排序了，应该用set，但是思路还是比较清晰的。
     * @param nums
     * @return
     */
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i];
            }
        }
        sum += nums[nums.length - 1];

        int total = (nums.length + 1) * nums.length / 2;
        result[1] = total - sum + result[0];
        return result;
    }

    public int[] findErrorNumsPro(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i)) duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }
}