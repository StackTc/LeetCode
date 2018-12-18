package arrayList;

public class SortArrayByParity {

    /**
     *
     * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
     *
     * You may return any answer array that satisfies this condition.
     *
     *
     *
     * Example 1:
     *
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * 因为输入数组的个数跟输出的一直，所以循环一次数组就可以，为了保证时间复杂度是O(n),偶数从数组头插入，基数都尾巴插入
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        int[] a = new int[A.length];
        int start = 0;
        int end = a.length -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                a[start] = A[i];
                start++;
            } else {
                a[end] = A[i];
                end--;
            }
        }
        return a;
    }
}
