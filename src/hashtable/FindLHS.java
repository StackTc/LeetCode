package hashtable;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindLHS
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-14 22:42
 * @version: v1.0
 */
public class FindLHS {

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        findLHS(nums);
    }

    public static int findLHS(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            int num1 = value + map.getOrDefault(key - 1, -value);
            int num2 = value + map.getOrDefault(key + 1, -value);
            result = Math.max(num1, num2) > result ? Math.max(num1, num2) : result;
        }

        return result;
    }

}