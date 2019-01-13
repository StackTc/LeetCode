package string;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: NumUniqueEmails
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-13 17:59
 * @version: v1.0
 */
public class NumUniqueEmails {


    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));

    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String localName = email.split("@")[0];
            String doMain = email.split("@")[1];

            localName = localName.replace(".","");
            localName = localName.substring(0, localName.indexOf("+"));
            set.add(localName + doMain);
        }
        return set.size();
    }
}