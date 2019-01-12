package hashtable;

import java.util.*;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: UncommonFromSentences
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-07 21:58
 * @version: v1.0
 */
public class UncommonFromSentences {

    public static void main(String[] args) {

    }

    public static String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] Aargs = A.split(" ");
        String[] Bargs = B.split(" ");
        String[] result = new String[Aargs.length + Bargs.length];
        int size = 0;
        for (int i = 0; i < Aargs.length; i++) {
            map.put(Aargs[i], map.getOrDefault(Aargs[i], 0) + 1);
        }

        for (int i = 0; i < Bargs.length; i++) {
            map.put(Bargs[i], map.getOrDefault(Bargs[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
                result[size++] = entry.getKey();
            }
        }

        return Arrays.copyOf(result, size);
    }
}