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
        for (int i = 0; i < s.length() - p.length(); i++) {
            String temp = s.substring(i, i + p.length());
            if (isAnagrans(temp,p)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isAnagrans(String s1 ,String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));

    }


}