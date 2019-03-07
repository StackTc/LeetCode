package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: MinMoves
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-07 20:32
 * @version: v1.0
 */
public class MinMoves {

    public static int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min,num);
        }

        for (int num : nums){
            sum += (num - min);
        }
        return sum;
    }

}