package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: ReverseVowels
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-17 23:33
 * @version: v1.0
 */
public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }

    public static String reverseVowels(String s) {
        String result = "";
        List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        List<Character> vowelList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                vowelList.add(c);
            }
        }

        int size = vowelList.size();

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.substring(i, i + 1).toCharArray()[0])) {
                result += vowelList.get(--size);
            } else {
                result += s.substring(i, i + 1);
            }

        }

        return result;
    }

    public static String reverseVowels1(String s) {
        if(s == null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){

            while(start<end && !vowels.contains(chars[start]+"")){
                start++;
            }

            while(start<end && !vowels.contains(chars[end]+"")){
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
}