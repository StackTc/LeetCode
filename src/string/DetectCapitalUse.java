package string;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: DetectCapitalUse
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-06 23:56
 * @version: v1.0
 */
public class DetectCapitalUse {

    //
    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {

        boolean firstBig = isBig(word.charAt(0));

        if (firstBig) {
            for (int i = 1; i < word.length() - 1; i++) {
                if (isBig(word.charAt(i)) != isBig(word.charAt(i + 1))) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (isBig(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean isBig(char a) {
        return a >= 'A' && a <= 'Z';
    }
}