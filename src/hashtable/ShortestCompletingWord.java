package hashtable;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ShortestCompletingWord
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-03 22:27
 * @version: v1.0
 */
public class ShortestCompletingWord {

    public static void main(String[] args) {
        shortestCompletingWord("Ar186787", new String[]{"nature","though","party","food","any","democratic","building","eat","structure","our"});
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            String temp = licensePlate.substring(i, i + 1).toLowerCase();
            if (temp.toCharArray()[0] >= 'a' && temp.toCharArray()[0] <= 'z') {
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        int index = Integer.MIN_VALUE;
        int len = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            String temp = words[i];
            Map<String, Integer> wordsMap = new HashMap<>();
            for (int j = 0; j < temp.length(); j++) {
                String tempS = temp.substring(j, j + 1).toLowerCase();
                wordsMap.put(tempS, wordsMap.getOrDefault(tempS, 0) + 1);
            }

            for (String key : map.keySet()) {
                Integer mapTime = map.get(key);
                Integer wordsMapTime = wordsMap.get(key);
                if (wordsMapTime == null) {
                    flag = false;
                    break;
                }

                if (mapTime.intValue() > wordsMapTime.intValue()) {
                    flag = false;
                    break;
                }
            }

            if (flag && temp.length() < len) {
                index = i;
                len = temp.length();
            }
        }

        return index != Integer.MIN_VALUE ? words[index] : "";
    }
}