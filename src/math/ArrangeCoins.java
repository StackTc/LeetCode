package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ArrangeCoins
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-07 20:41
 * @version: v1.0
 */
public class ArrangeCoins {

    public static void main(String[] args) {
        arrangeCoins(3);
    }

    public static int arrangeCoins(int n) {
        int line = 0;
        if (n <= 1) {
            return n;
        }
        int temp = n;
        for (int i = 1; i < temp; i++) {
            n = n - i;
            if (n >= 0) {
                line++;
            } else {
                break;
            }
        }

        return line;
    }
}