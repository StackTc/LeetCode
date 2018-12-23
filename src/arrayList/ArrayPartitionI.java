package arrayList;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1;) {
            result += Math.min(nums[i], nums[i + 1]);
            //关键
            i = i + 2;
        }
        return result;
    }
}
