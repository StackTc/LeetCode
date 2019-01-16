package string;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ReverseWords
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-16 21:47
 * @version: v1.0
 */
public class ReverseWords {


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String addString = "";
            String index = strings[i];
            for (int j = index.toCharArray().length - 1; j >= 0; j--) {
                addString += index.toCharArray()[j];
            }
            strings[i] = addString;

        }

        //利用好这里 就可以了。
        return String.join(" ", strings);
    }
}