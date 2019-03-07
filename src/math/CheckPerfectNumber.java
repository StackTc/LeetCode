package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: CheckPerfectNumber
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-07 21:52
 * @version: v1.0
 */
public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if(num < 2) return false;
        int sum = 1;
        for(int i = 2; i * i <= num; i++) {
            if(num%i == 0) sum += i + num/i;
        }
        return sum == num;
    }
}