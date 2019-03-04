package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindRestaurant
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-04 21:30
 * @version: v1.0
 */
public class FindRestaurant {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int sum = Integer.MIN_VALUE;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> map3 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }

        map3 = list1.length > list2.length ? map2 : map1;

        for (String key : map3.keySet()) {
            Integer index1 = map1.get(key);
            Integer index2 = map2.get(key);
            if (index1 == null || index2 == null) {
                continue;
            }

            if (index1 + index2 < sum) {
                list.clear();
            }

            if (index1 + index2 <= sum) {
                list.add(key);
                sum = index1 + index2;
            }

        }
        String[] strings = new String[list.size()];
        return list.toArray(strings);
    }



    public String[] discuss(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap();
        List<String> res = new ArrayList();
        for (int i = 0; i < list1.length; ++i) {
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; ++i) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if (sum < minSum) {
                    res.clear();
                    res.add(list2[i]);
                    minSum = sum;
                } else if (sum == minSum) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}