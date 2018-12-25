package arrayList;

import javax.swing.tree.TreeNode;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur++;
            } else {
                //这里一定要注意顺序，不要先置为0，然后再去比较，哈哈
                if (cur > maximum) {
                    maximum = cur;
                }
                cur = 0;
            }
        }
        return maximum > cur ? maximum : cur;
    }
}
