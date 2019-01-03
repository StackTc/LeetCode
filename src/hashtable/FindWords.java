package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindWords
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-03 22:54
 * @version: v1.0
 */
public class FindWords {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        findWords(words);
    }

    public static String[] findWords(String[] words) {
        List<String> firstLine = new ArrayList<>(Arrays.asList("q","w","e","r","t","y","u","i","o","p"));
        List<String> secondLine = new ArrayList<>(Arrays.asList("a","s","d","f","g","h","j","k","l"));
        List<String> thirdLine = new ArrayList<>(Arrays.asList("z","x","c","v","b","n","m"));
        List<String> result = new ArrayList<>();
        boolean isOk;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            isOk = false;
            for (int j = 0; j < s.length() - 1; j++) {
                if (firstLine.contains(s.substring(j, j + 1).toLowerCase()) != firstLine.contains(s.substring(j + 1, j + 2).toLowerCase())) {
                    break;
                }

                if (secondLine.contains(s.substring(j, j + 1).toLowerCase()) != secondLine.contains(s.substring(j + 1, j + 2).toLowerCase())) {
                    break;
                }

                if (thirdLine.contains(s.substring(j, j + 1).toLowerCase()) != thirdLine.contains(s.substring(j + 1, j + 2).toLowerCase())) {
                    break;
                }

                if (j == s.length() - 2) {
                    isOk = true;
                }
            }

            if (isOk) {
                result.add(s);
            }

        }
        String[] res = new String[result.size()];
        return result.toArray(res);
    }
}