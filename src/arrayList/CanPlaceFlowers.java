package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: CanPlaceFlowers
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-01 00:27
 * @version: v1.0
 */
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] num = {1,1,1,0,0};
        System.out.println(canPlaceFlowers(num,1));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            //如果是0有机会种花
            if (flowerbed[i] == 0) {
                //能种花的时候一定是3个0一起的时候，所以要判断当前跟后面的，还有前面的
                //还有一种情况就是，当2个0在最后2个位置的时候也可以种花，计算一定在最后一个位置，因为倒数第三个是1个话 i直接加2，
                //所以 [i - 1]一定要是0，
                if(((i+1 < flowerbed.length && flowerbed[i+1] == 0)|| i+1 == flowerbed.length) &&(i==0 || flowerbed[i-1] == 0)) {
                    count++;
                    i += 1;
                    continue;
                }
            } else {
                i++;
            }
        }
        return count >= n;
    }

}