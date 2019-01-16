package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: NumberOfBoomerangs
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-16 20:55
 * @version: v1.0
 */
public class NumberOfBoomerangs {


    public static void main(String[] args) {

    }


    /**
     * 关键点在于，如果相同距离的个数有2个说明 有2个 可以组合，组合个数 为 a(a - 1),
     * 那么 如果 同一个距离只有1个，那么就说明没有2个点 距离相同
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Double,Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }

                double d = Math.pow(points[i][0] - points[j][0],2) + Math.pow(points[i][1] - points[j][1],2);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for (int value : map.values()) {
                result += value * (value - 1);
            }
            map.clear();
        }
        return result;
    }

}