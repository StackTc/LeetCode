package string;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: CheckRecord
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-15 20:17
 * @version: v1.0
 */
public class CheckRecord {

    public static void main(String[] args) {
        System.out.println(checkRecord("LALL"));
    }


    public static boolean checkRecord(String s) {
        int Lcount = 0;
        int Acount = 0;
        for (Character c : s.toCharArray()) {
            if ('A' == c) {
                Lcount = 0;
                Acount++;
                if (Acount > 1) {
                    return false;
                }
            } else if ('L' == c) {
                Lcount++;
            } else if ('P' == c) {
                Lcount = 0;
            }

            if (Lcount > 2) {
                return false;
            }

        }

        return true;
    }
}