package arrayList;

public class MatrixReshape {

    public static void main(String[] args) {

    }

    /**
     * 将原来的数组中的值，重新放入一个定义好的 数组里面
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r >= nums.length && c >= nums[0].length) {
            return nums;
        }
        int a = 0;
        int b = 0;
        int[][] rnums = new int[r][c];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                rnums[a][b] = nums[i][j];
                if (b < c - 1) {
                    b++;
                } else {
                    b = 0;
                    a++;
                }
            }
        }
        return rnums;
    }

}
