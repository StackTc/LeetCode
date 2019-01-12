package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: FindMinDifference
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-10 00:31
 * @version: v1.0
 */
public class FindMinDifference {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("05:31");
        strings.add("22:08");
        strings.add("00:35");
        System.out.println(findMinDifference(strings));
    }

    public static int findMinDifference(List<String> timePoints) {
        int[] minutes= new int[timePoints.size()];
        int index = 0;
        for (String point : timePoints) {
            int minute = Integer.valueOf(point.split(":")[0]) * 60 + Integer.valueOf(point.split(":")[1]);
            minutes[index++] = minute == 0 ? 1440 : minute;
        }

        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.length - 1; i++) {
            min = Math.min(minutes[i + 1] - minutes[i], min);
        }

        int last = Math.min(Math.abs(minutes[minutes.length - 1] - minutes[0]),Math.abs(1440 + minutes[0] - minutes[minutes.length - 1]));
        return Math.min(last,min);
        //
    }

}