package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: SubdomainVisits
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-07 22:24
 * @version: v1.0
 */
public class SubdomainVisits {

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(subdomainVisits(cpdomains));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < cpdomains.length; i++) {
            Integer times = Integer.valueOf(cpdomains[i].split(" ")[0]);
            map.put(cpdomains[i].split(" ")[1], map.getOrDefault(cpdomains[i].split(" ")[1],0) + times);
            int start = 0;
            while (cpdomains[i].split(" ")[1].indexOf(".", start) != -1) {
                String str = cpdomains[i].split(" ")[1].substring(cpdomains[i].split(" ")[1].indexOf(".", start) + 1);
                map.put(str,map.getOrDefault(str,0) + times);
                start = cpdomains[i].split(" ")[1].indexOf(".", start) + 1;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }

        return list;

    }
}