package arrayList;

public class SortArrayByParityII {

    public static void main(String[] args) {

    }

    public static int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];
        int odd = 0;
        int even = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[odd] = A[i];
                odd += 2;
            } else {
                B[even] = A[i];
                even += 2;
            }
        }
        return B;
    }
}
