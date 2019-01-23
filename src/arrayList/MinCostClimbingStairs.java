package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: MinCostClimbingStairs
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-23 21:53
 * @version: v1.0
 */
public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int f1  =0,f2 = 0;
        for (int i = 0; i < cost.length - 1; i++) {
            int f0 = cost[i] + Math.min(f1,f2);
            f2 = f1;
            f1 = f0;
        }

        return Math.min(f1,f2);
    }

}