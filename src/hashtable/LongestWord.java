package hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: LongestWord
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-08 23:37
 * @version: v1.0
 */
public class LongestWord {

    public static String longestWord(String[] words) {
        Arrays.sort(words);
        String ret = "";
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == 1 || set.contains(words[i].substring(0, words[i].length() - 1))) {
                ret = words[i].length() > ret.length() ? words[i] : ret;
                set.add(words[i]);
            }
        }

        return ret;
    }
}