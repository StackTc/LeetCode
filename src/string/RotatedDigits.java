package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: RotatedDigits
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-13 18:26
 * @version: v1.0
 */
public class RotatedDigits {


    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));

    }

    public static int rotatedDigits(int N) {
        Set<Integer> notNumSet = new HashSet<>(Arrays.asList(3,4,7));
        Set<Integer> goodNumSet = new HashSet<>(Arrays.asList(2,5,6,9));

        int result = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            boolean isOk = false;
            while (n != 0) {
                if (notNumSet.contains(n % 10)) {
                    //只要有一个数字倒过来变成非数字，那么就可以不交验这个数字了、
                    isOk = false;
                    break;
                } else if (goodNumSet.contains(n % 10)) {
                    //这里注意一下，并不是有一个ok的数字 ok就整个数字ok的，
                    // 因为后面的数字可以倒过来就变成非数字了
                    // ，所以如果ok一定是循环了所有的数字、
                    isOk = true;
                }
                n = n / 10;
            }
            if (isOk) {
                result ++;
            }
        }
        return result;
    }

    class Solution {
        public int rotatedDigits(int N) {
            Set<Integer> good = new HashSet<Integer>(Arrays.asList(2,5,6,9));
            Set<Integer> bad = new HashSet<Integer>(Arrays.asList(3,4,7));
            int count=0;
            for(int i=1;i<=N;i++) {
                boolean gud=false;
                int num=i;
                while(num!=0) {
                    int digit = num%10;
                    if(bad.contains(digit))
                    {
                        gud=false; break;
                    }
                    else if(good.contains(digit))
                        gud=true;
                    num=num/10;
                }
                if(gud)
                    count++;
            }
            return count;
        }
    }
}