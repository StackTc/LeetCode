package string;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ReverseOnlyLetters
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-16 22:29
 * @version: v1.0
 */
public class ReverseOnlyLetters {


    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        sb.reverse();

        for (int i = 0; i < S.toCharArray().length; i++) {
            if (!Character.isLetter(S.toCharArray()[i])) {
                sb.insert(i, S.toCharArray()[i]);
            }
        }

        return sb.toString();
    }
}