package arrayList;

public class IsMonotonic {
    public static void main(String[] args) {

    }

    /**|
     * 解题思路主要是记录第一次不想等的数字到底是前面大还是后面大，
     * 第一次进入用标志位，进入以后改变boolean值，保证下次不进入，然后记录一开始2个不相等的值的大小关系
     * 接下来值，如果相等直接跳过，如果不相等判断大小顺序是否与第一次一样。
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        //如果长度小于2一定是按照顺序来的，不管是大到小，还是小到大。
        if(A.length <= 2) {
            return true;
        }

        boolean first = false;
        boolean preBigger = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                continue;
            }
            //第一次比较不想等的值，用标志位，第一次比较以后直接跳过，因为一定是true
            if (!first) {
                preBigger = A[i] > A[i + 1];
                first = true;
                continue;
            }

            boolean compare  = A[i] > A[i + 1];
            if (preBigger != compare) {
                return false;
            }
        }
        return true;
    }
}
