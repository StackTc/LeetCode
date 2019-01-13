package string;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: Judge
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-13 19:10
 * @version: v1.0
 */
public class Judge {


    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        //这里用moves.toChar会更好，毕竟substring消耗大。
        for (int i = 0; i < moves.length(); i++) {
            String s = moves.substring(i, i + 1);
            if ("L".equals(s)) {
                x--;
            } else if ("R".equals(s)) {
                x++;
            } else if ("U".equals(s)) {
                y++;
            } else if ("D".equals(s)) {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}