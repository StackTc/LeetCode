package arrayList;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: LargeGroupPositions
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-18 23:09
 * @version: v1.0
 */
public class LargeGroupPositions {


    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
    }

    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < S.toCharArray().length - 1; i++) {
            if (S.toCharArray()[i] == S.toCharArray()[i + 1]) {
                count++;
                continue;
            }

            if (count >= 2) {
                result.add(Arrays.asList(i - count, i));
            }
            count = 0;
        }

        if (count >= 2) {
            result.add(Arrays.asList(S.length() - 1 - count, S.length() - 1));
        }

        return result;
    }
}