package hashtable;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: CountPrimes
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-01 22:29
 * @version: v1.0
 */
public class CountPrimes {


    public int countPrimes(int n) {
        int result = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    /**
     * 判断素数
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if(n == 2) return true;//2特殊处理
        if(n < 2 || n % 2 == 0) return false;//识别小于2的数和偶数
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n % i == 0){//识别被奇数整除
                return false;
            }
        }
        return true;
    }
}