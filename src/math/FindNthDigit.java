package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindNthDigit
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-06 21:05
 * @version: v1.0
 */
public class FindNthDigit {

    public static void main(String[] args) {
        System.out.println(findNthDigit(2147483647));
    }

    public static int findNthDigit(int n) {
        long start = 1;
        long count = 9;
        int len = 1;
        long temp = n;

        //9  99 999
        while (temp > count * len) {
            n -= count * len;
            len++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = Long.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}