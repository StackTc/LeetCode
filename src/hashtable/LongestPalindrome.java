package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: LongestPalindrome
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-04 20:57
 * @version: v1.0
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        longestPalindrome("abccccdd");
    }

    public static int longestPalindrome(String s) {
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i + 1);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }


        for (String key : map.keySet()) {
            Integer times = map.get(key);
            if (times / 2 > 0) {
                count += (times / 2) * 2;
            }
        }

        if ((count > 0 && count < s.length()) || count == 0) {
            count++;
        }

        return count;
    }


}