package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: Intersect
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-01 22:54
 * @version: v1.0
 */
public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int length = Math.min(nums1.length,nums2.length);
        int[] nums = new int[length];
        int size = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //先将第一个数组存在的值放进去
        for (int i : nums1) {
            map.put(i,map.getOrDefault(i, 0) + 1);
        }

        //查找重复的值，
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                nums[size++] = i;
                map.put(i,map.getOrDefault(i, 0) - 1);
            }
        }

        //因为可能存在0，所以这里要复制 size大小的数组返回才是正确的。
        return Arrays.copyOf(nums, size);
    }
}