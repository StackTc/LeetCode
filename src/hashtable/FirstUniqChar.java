package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FirstUniqChar
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-14 23:11
 * @version: v1.0
 */
public class FirstUniqChar {

    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.toCharArray().length; i++) {
            if (map.get(s.toCharArray()[i]) == 1) {
                return i;
            }
        }

        return -1;
    }


    /**
     * 牛逼
     * @param s
     * @return
     */
    public static int firstUniqCharAnu(String s) {
        int min = s.length();
        for(char c = 'a'; c <= 'z'; c++) {
            if(s.indexOf(c) != -1 && s.indexOf(c) == s.lastIndexOf(c))
                min = Math.min(min, s.indexOf(c));
        }
        return min==s.length()?-1: min;
    }
}