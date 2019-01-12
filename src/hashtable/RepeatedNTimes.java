package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: RepeatedNTimes
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-05 22:23
 * @version: v1.0
 */
public class RepeatedNTimes {

    public static void main(String[] args) {

    }

    public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return 0;
    }
}