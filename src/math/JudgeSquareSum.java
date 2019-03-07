package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: JudgeSquareSum
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-07 21:16
 * @version: v1.0
 */
public class JudgeSquareSum {

    public static void main(String[] args) {
        judgeSquareSum(1000);
    }

    public static boolean judgeSquareSum(int c) {
        double end = (int)Math.sqrt(c);
        int start = 0;
        while (start <= end) {
            double temp = Math.pow(start,2) + Math.pow(end,2);
            if (temp == c) {
                return true;
            }

            if (temp > c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}