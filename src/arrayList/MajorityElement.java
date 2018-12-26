package arrayList;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }

    /**
     * 如果数组大于数字的一半，那么中间那个肯定是大于一半的数，小技巧。
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
