package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindTheDifference
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-05 21:29
 * @version: v1.0
 */
public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd",
                "abcde"));
    }

    public static char findTheDifference(String s, String t) {

        Map<String,Integer> sortMap = new HashMap<>();
        for (int i = 0; i < t.length(); i ++) {
            sortMap.put(t.substring(i, i + 1),sortMap.getOrDefault(t.substring(i, i + 1),0) + 1);
        }

        for (int i = 0; i < s.length(); i ++) {
            sortMap.put(s.substring(i, i + 1),sortMap.getOrDefault(s.substring(i, i + 1),0) - 1);
        }

        for (Map.Entry<String,Integer> temp : sortMap.entrySet()) {
            if (temp.getValue() > 0) {
                return temp.getKey().charAt(0);
            }
        }

        return 'a';
    }
}