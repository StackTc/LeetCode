package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: IsPerfectSquare
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-05 22:49
 * @version: v1.0
 */
public class IsPerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    /**
     * 二分法查找
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        long start = num % 2 == 0? num / 2 : (num / 2) + 1;
        long end = num % 2 == 0? num / 2 : (num / 2) + 1;
        //查出开始范围
        while(end * end > num) {
            start = end;
            end = end % 2 == 0? end / 2 : (end / 2) + 1;
        }

        //从开始遍历到结束
        while(end * end < num && end < start) {
            end++;
            if(end * end == num) {
                return true;
            }
        }
        return end * end == num;

    }
}