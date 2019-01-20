package arrayList;

import java.util.ArrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ValidMountainArray
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-18 22:04
 * @version: v1.0
 */
public class ValidMountainArray {

    public static void main(String[] args) {
        int[] a = {14,84,79,70,70,68,67};
        System.out.println(validMountainArray(a));
    }

    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int headIndex = Integer.MIN_VALUE;
        int endIndex = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1]) {
                if (headIndex == Integer.MIN_VALUE) {
                    headIndex = i;
                }

            }

            if (A[A.length - i - 2] <= A[A.length - i - 1] ) {
                if (endIndex == Integer.MAX_VALUE) {
                    endIndex = A.length - i - 1;
                }

            }

        }

        return headIndex == endIndex;
    }
}