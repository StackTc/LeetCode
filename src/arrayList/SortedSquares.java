package arrayList;

import java.util.Arrays;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: SortedSquares
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-02 14:12
 * @version: v1.0
 */
public class SortedSquares {

    public static void main(String[] args) {
    }

    public static int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = (int) Math.pow(A[i], 2);
        }
        Arrays.sort(B);
        return B;
    }
}