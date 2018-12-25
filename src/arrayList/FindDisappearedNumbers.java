package arrayList;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    //Input:
    //[4,3,2,7,8,2,3,1]
    //
    //Output:
    //[5,6]
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        /**
         * 通过将下标标志负数，那么第二次循环的时候，某个数字是正数的说明，该位置从未出现过。
         */
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}
