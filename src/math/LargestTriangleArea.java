package math;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: LargestTriangleArea
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-10 19:14
 * @version: v1.0
 */
public class LargestTriangleArea {

    public static void main(String[] args) {
        int[][] points = {{1,0},{0,0},{0,1}};
        largestTriangleArea(points);
    }

    public static double largestTriangleArea(int[][] points) {
        double max = 0.0;
        for (int i = 0; i < points.length - 2; i++)
            for (int j = i + 1; j < points.length - 1; j++)
                for (int k = j + 1; k < points.length; k++)
                    max = Math.max(max, areaCal(points[i], points[j], points[k]));
        return max;
    }

    public static double areaCal(int[] pt1, int[] pt2, int[] pt3) {
        return Math.abs(pt1[0] * (pt2[1] - pt3[1]) + pt2[0] * (pt3[1] - pt1[1]) + pt3[0] * (pt1[1] - pt2[1])) / 2.0;
    }
}