package arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: CommonChars
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-03 21:26
 * @version: v1.0
 */
public class CommonChars {

    public static void main(String[] args) {

    }

    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[][] table = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                table[i][A[i].charAt(j) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < A.length; j++) {
                min = Math.min(table[j][i],min);
            }

            if (min == Integer.MAX_VALUE || min == 0) {
                continue;
            }

            for (int a = 0; a < min; a++) {
                list.add("" + (char)('a' + min));
            }
        }

        return list;
    }
}