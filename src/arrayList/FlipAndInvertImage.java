package arrayList;

public class FlipAndInvertImage {

    public static void main(String[] args) {

        //Test [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
        //  [[1,1,0],[1,0,1],[0,0,0]]
        Object[] a = new Long[1];
        int A[][] = {{1, 1,0,0}, {1, 0,0, 1}, {1, 0, 1,0}};
        int B[][] = flipAndInvertImage(A);

        for (int i = 0; i < B.length; i++) {
            System.out.println();
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + ",");
            }
        }
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2 ; j++) {
                //水平反转
                //[1,1,0]会产生[0,1,1]。
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = temp;

            }

            for (int j = 0; j < A[i].length; j++) {
                //反转
                //反转[0,1,1]会产生[1,0,0]。
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }
}
