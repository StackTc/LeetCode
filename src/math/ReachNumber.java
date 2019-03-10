package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ReachNumber
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-10 18:18
 * @version: v1.0
 */
public class ReachNumber {


    public static void main(String[] args) {
        System.out.println(reachNumber(3));

    }


    //因为要获取最小的步数，所以先用一个while获取到大于target的最小值，
    // 然后因为 移动一次 差值都是2 * i，所以第二个while 寻找到差值为双数的

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}