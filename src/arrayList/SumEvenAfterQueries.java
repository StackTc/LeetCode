package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: SumEvenAfterQueries
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-02 14:31
 * @version: v1.0
 */
public class SumEvenAfterQueries {

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        sumEvenAfterQueries(A,queries);
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] B = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int val = queries[i][0];
            A[index] += val;
            B[i] = getSumOfArray(A);
        }
        return B;
    }

    public static int getSumOfArray(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result += A[i];
            }
        }
        return result;
    }

    //discus

    public int[] discus(int[] A, int[][] queries) {
        int sum = 0;
        for (int a : A) { if (a % 2 == 0) sum += a ; } // sum of even #s.
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; ++i) {
            int idx = queries[i][1];
            if (A[idx] % 2 == 0) { sum -= A[idx]; } // from 1) and 2)
            A[idx] += queries[i][0];
            if (A[idx] % 2 == 0) { sum += A[idx]; } // from 2) and 3)
            ans[i] = sum;
        }
        return ans;
    }
}