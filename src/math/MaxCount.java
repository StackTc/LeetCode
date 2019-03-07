package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: MaxCount
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-07 22:14
 * @version: v1.0
 */
public class MaxCount {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] operations = {{2,2},{2,3}};

        maxCount(m,n,operations);
    }

    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m * n;

        int x = ops[0][0];
        int y = ops[0][1];

        for(int i = 0; i < ops.length; i++) {
            if(ops[i][0] < x)
                x = ops[i][0];
            if(ops[i][1] < y)
                y = ops[i][1];
        }

        if(x > m)
            x = m;
        if(y > n)
            y = n;

        return x * y;
    }

}