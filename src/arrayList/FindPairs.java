package arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindPairs
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2018-12-31 17:27
 * @version: v1.0
 */
public class FindPairs {


    public static void main(String[] args) {
        int[] test = {3,1,4,1,5};
        System.out.println(findPairs(test,2));

    }

    public static int findPairs(int[] nums, int k) {
        Set<String> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] - nums[j] == k) {
                    set.add(nums[i] + "," + nums[j]);
                }
            }
        }
        return set.size();
    }
}