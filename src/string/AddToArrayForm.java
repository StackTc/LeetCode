package string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>addToArrayForm
 * File Name: AddToArrayForm
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-02-24 23:01
 * @version: v1.0
 */
public class AddToArrayForm {

    public static void main(String[] args) {
        int[] A = {0};
        int K = 23;

        addToArrayForm(A, K);
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        if (A == null) return null;
        LinkedList<Integer> result = new LinkedList<Integer>();
        String s = String.valueOf(K);

        int carry = 0, i = A.length - 1, j = s.length() - 1;
        int v1 = 0, v2 = 0;
        while (i >= 0 || j >= 0) {


            v1 = j >= 0 ? s.charAt(j--) - '0' : 0;
            v2 = i >= 0 ? A[i--] : 0;

            int sum = v1 + v2 + carry;

            if (sum >= 10) {
                result.offerFirst(sum % 10);
                carry = 1;
            } else {
                result.offerFirst(sum);
                carry = 0;
            }

        }

        if (carry > 0)
            result.offerFirst(carry);

        return result;
    }
}