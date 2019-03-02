package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: NumRookCaptures
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-02 14:46
 * @version: v1.0
 */
public class NumRookCaptures {

    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','.','p','.','p','.'},{'.','p','.','.','.','.','.','.'},{'.','p','B','.','R','.','B','p'},{'.','p','.','.','.','B','.','.'},{'.','.','p','.','.','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        numRookCaptures(board);
        
//        char[][] board =
//{{'.','.','.','.','.','.','.','.'},{'.','.','.','.','p','.','p','.'},{'.','p','.','.','.','.','.','.'},{'.','p','B','.','R','.','B','p'},{'.','p','.','.','.','B','.','.'},{'.','.','p','.','.','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

    public static int numRookCaptures(char[][] board) {
        int result = 0;
        int x = 0;
        int y = 0;


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }

        //x方向
        for (int i = y; i < 8; i++) {
            if (board[x][i] == 'B') {
                break;
            } else if (board[x][i] == 'p') {
                result++;
                break;
            }
        }

        for (int i = y; i > 0; i--) {
            if (board[x][i] == 'B') {
                break;
            } else if (board[x][i] == 'p') {
                result++;
                break;
            }
        }

        //y方向
        for (int i = x; i < 8; i++) {
            if (board[i][y] == 'B') {
                break;
            } else if (board[i][y] == 'p') {
                result++;
                break;
            }
        }

        for (int i = y; i > 0; i--) {
            if (board[i][y] == 'B') {
                break;
            } else if (board[i][y] == 'p') {
                result++;
                break;
            }
        }

        return result;
    }
}