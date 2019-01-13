package string;

import java.util.HashSet;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: UniqueMorseRepresentations
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-13 17:36
 * @version: v1.0
 */
public class UniqueMorseRepresentations {


    public static void main(String[] args) {

    }

    ////
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        StringBuilder mString = new StringBuilder();
        HashSet h = new HashSet();
        for (String wrd : words) {

            char[] caArray = wrd.toCharArray();

            for (int i = 0; i < caArray.length; i++) {

                mString=mString.append(morseCode[caArray[i]-97]);
            }
            h.add(mString.toString());
            mString.setLength(0);

        }
        return h.size();
    }

}