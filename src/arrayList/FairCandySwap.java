package arrayList;

public class FairCandySwap {

    public static void main(String[] args) {
        int A[] = new int[2];
        A[0] = 1;
        A[1] = 1;
        int B[] = new int[2];
        B[0] = 2;
        B[1] = 2;
        int[] c = fairCandySwap(A,B);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] r = new int[2];
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < A.length; i++) {
            aliceSum += A[i];
        }

        for (int i = 0; i < B.length; i++) {
            bobSum += B[i];
        }

        int dif = bobSum - aliceSum;

        for (int Astart = 0; Astart < A.length; Astart++) {
            for (int Bstart = 0; Bstart < B.length; Bstart++) {
                if ((B[Bstart] - A[Astart]) * 2 == dif) {
                    r[0] = A[Astart];
                    r[1] = B[Bstart];
                    return r;
                }
            }
        }

        return null;

    }
}
