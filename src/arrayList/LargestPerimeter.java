package arrayList;

import java.util.Arrays;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: LargestPerimeter
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-02 13:55
 * @version: v1.0
 */
public class LargestPerimeter {


    public static void main(String[] args) {
        int[] A = {3,2,3,4};

        System.out.println(largestPerimeter(A));
    }

    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int result = 0;
        for (int i = A.length - 1; i >= 2 ;i--) {
            if (istriangle(A[i], A[i - 1], A[i - 2])) {
                result = A[i] + A[i - 1] + A[i - 2];
                break;
            }
        }
        return result;
    }

    private static boolean istriangle(int a,int b,int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}