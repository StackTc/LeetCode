package hashtable;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindAnagrams
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-04 23:31
 * @version: v1.0
 */
public class FindAnagrams {

    public static void main(String[] args) {
        findAnagrams("cbaebabacd",
                "abc");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<String,Integer> pmap = new HashMap<>();
        for (int i = 0; i < p.length();i++) {
            pmap.put(p.substring(i,i + 1),pmap.getOrDefault(p.substring(i,i + 1),0) + 1);
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            boolean flag = true;
            Map<String,Integer> map = new HashMap<>(pmap);
            for (int j = i; j < i + p.length(); j++) {
                //说明p中不存在s
                if (map.getOrDefault(s.substring(j, j + 1), - 1) <= 0) {
                    flag = false;
                    break;
                }
                map.put(s.substring(j, j + 1), map.getOrDefault(s.substring(j, j + 1), - 1) - 1);
            }
            if (flag) {
                result.add(i);
            }

        }
        return result;
    }


}