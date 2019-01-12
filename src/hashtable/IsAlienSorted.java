package hashtable;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: IsAlienSorted
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-05 22:48
 * @version: v1.0
 */
public class IsAlienSorted {


    public static void main(String[] args) {
        String[] words = {"kuvp","q"};
        String order = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println(isAlienSorted(words, order));

    }

    public static boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < words.length - 1; i++) {
            String font = words[i];
            String back = words[i + 1];

            int min = Math.min(font.length(),back.length());
            for (int j = 0; j < min; j++) {
                if (order.indexOf(String.valueOf(font.charAt(j))) > order.indexOf(String.valueOf(back.charAt(j)))) {
                    return false;
                }

                if (order.indexOf(String.valueOf(font.charAt(j))) < order.indexOf(String.valueOf(back.charAt(j)))) {
                    break;
                }
            }

            if (font.contains(back) && font.length() > back.length()) {
                return false;
            }
        }

        return true;
    }
}