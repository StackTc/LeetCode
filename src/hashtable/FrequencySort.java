package hashtable;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FrequencySort
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-02 17:55
 * @version: v1.0
 */
public class FrequencySort {

    public static void main(String[] args) {
        System.out.println(frequencySort("eert"));

    }

    public static String frequencySort(String s) {
        Map<String,Integer> keyMap = new HashMap<>();
        TreeMap<Integer, List<String>> timesMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            keyMap.put(s.substring(i, i + 1),keyMap.getOrDefault(s.substring(i, i + 1), 0) + 1);
        }

        for (Map.Entry<String,Integer> entry : keyMap.entrySet()) {
            if (timesMap.containsKey(entry.getValue())) {
                List<String> s1 = timesMap.get(entry.getValue());
                s1.add(entry.getKey());
                timesMap.put(entry.getValue(), s1);
            } else {
                List<String> s1 = new ArrayList<>();
                s1.add(entry.getKey());
                timesMap.put(entry.getValue(), s1);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, List<String>> entry : timesMap.entrySet()) {
            List<String> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                for(int j=0;j<entry.getKey();j++) {
                    builder.append(list.get(i));
                }
            }
        }

        return builder.toString();
    }

    public static String getStringByTimeAndKey(String key, Integer time) {
        String result = "";
        for (int i = 0; i < time; i++) {
            result += key;
        }
        return result;
    }
}