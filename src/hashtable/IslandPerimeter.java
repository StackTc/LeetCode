package hashtable;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: IslandPerimeter
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-03 23:39
 * @version: v1.0
 */
public class IslandPerimeter {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0}};
        System.out.println(islandPerimeter(grid));

    }

    /**
     * 先将各个边填充0，然后循环判断1的周围是不是0，如果是那么周长加1，效率低。
     * @param grid
     * @return
     */
    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        int[][] gridTemp = new int[grid.length + 2][grid[0].length + 2];
        for (int i = 0; i < gridTemp.length; i++) {
            for (int j = 0; j < gridTemp[0].length; j++) {
                if (i == 0 || i == gridTemp.length - 1 || j == 0 || j == gridTemp[0].length - 1) {
                    gridTemp[i][j] = 0;
                } else {
                    gridTemp[i][j] = grid[i - 1][j - 1];
                }
            }
        }

        for (int i = 1; i < gridTemp.length - 1; i++) {
            for (int j = 1; j < gridTemp[0].length - 1; j++) {

                if (gridTemp[i][j] == 1) {
                    if (gridTemp[i - 1][j] == 0) {
                        result++;
                    }
                    if (gridTemp[i + 1][j] == 0) {
                        result++;
                    }
                    if (gridTemp[i][j - 1] == 0) {
                        result++;
                    }
                    if (gridTemp[i][j + 1] == 0) {
                        result++;
                    }
                }


            }
        }

        return result;
    }


    /**
     * 竖着看，如果下面那个出现会使 2个边重合，从而减少周长2，效率高。
     * @param grid
     * @return
     */
    public static int islandPerimeter1(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;
                    if (i < grid.length-1 && grid[i+1][j] == 1) {
                        ans -= 2;
                    }
                    if (j < grid[0].length-1 && grid[i][j+1] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;
    }
}