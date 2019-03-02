package string;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: AddStrings
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-02-24 22:29
 * @version: v1.0
 */
public class AddStrings {

    public static void main(String[] args) {
        String s = addStrings("9", "99");
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        int jin = 0;
        int num = 0;
        int pos= 0;
        StringBuilder mergerStr = new StringBuilder();

        //关键
        while (pos < num1.length() || pos < num2.length()) {
            int num1Temp = num1.length() - pos  - 1 < 0 ? 0 : Integer.valueOf(String.valueOf(num1.charAt(num1.length() - pos - 1)));
            int num2Temp = num2.length() - pos - 1 < 0 ? 0 : Integer.valueOf(String.valueOf(num2.charAt(num2.length() - pos - 1)));
            num = (num1Temp + num2Temp + jin) % 10;
            jin = (num1Temp + num2Temp + jin) / 10;
            mergerStr.insert(0,num);
            pos++;
        }

        if (jin == 1) {
            mergerStr.insert(0, "1");
        }

        return mergerStr.toString();
    }
}