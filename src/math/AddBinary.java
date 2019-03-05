package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: AddBinary
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-05 22:11
 * @version: v1.0
 */
public class AddBinary {

    public static void main(String[] args) {
        addBinary("1","11");
    }

    public static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int alen = a.length();
        int blen = b.length();
        int jinwei = 0;
        while (alen > 0 || blen > 0) {
            int aindex = 0;
            int bindex = 0;
            if (alen > 0) {
                aindex = Integer.parseInt(a.substring(alen - 1,alen));
            }
            if (blen > 0) {
                bindex = Integer.parseInt(b.substring(blen - 1,blen));
            }
            int sum = aindex + bindex + jinwei;
            jinwei = sum / 2;

            s.append(sum % 2);
            alen--;
            blen--;
        }

        while (jinwei > 0) {
            s.append(jinwei % 2);
            jinwei = jinwei / 2;
        }

        return s.reverse().toString();
    }
}