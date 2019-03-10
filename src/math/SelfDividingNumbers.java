package math;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: SelfDividingNumbers
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-09 09:55
 * @version: v1.0
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
//        List<Integer> list = selfDividingNumbers(1,22);
//        for (Integer index : list) {
//            System.out.println(index);
//        }
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++ ) {
            if (isFullNum(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isFullNum(int num) {
        int length = (int) Math.log10(num) + 1;
        int temp = num;
        for (int i = 0; i < length; i++) {
            int divisor = num % 10;
            if (divisor == 0) {
                return false;
            }
            if (temp % divisor != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

}