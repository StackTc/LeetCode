package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: DistributeCandies
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-14 23:36
 * @version: v1.0
 */
public class DistributeCandies {

    public static void main(String[] args) {

    }


    public static int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : candies) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        if (map.size() >= candies.length / 2) {
            return candies.length / 2;
        } else {
            return map.size();
        }

    }
}