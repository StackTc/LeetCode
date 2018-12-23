package arrayList;

public class isToeplitzMatrix {
    public static void main(String[] args) {

    }

    //[1,2,3,4],
    //  [5,1,2,3],
    //  [9,5,1,2]

    //[[1,2]
    // [2,2]]
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i <= matrix.length - 2; i++) {
            for (int j = 0; j <= matrix[i].length - 2; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
