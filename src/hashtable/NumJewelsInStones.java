package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: NumJewelsInStones
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-08 00:10
 * @version: v1.0
 */
public class NumJewelsInStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {

        Set<String> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < J.length(); i++) {
            set.add(J.substring(i, i + 1));
        }

        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.substring(i, i + 1))) {
                result++;
            }
        }

        return result;
    }
}