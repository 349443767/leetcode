/**
 * @author hongwei
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/19 上午10:06
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        throw new RuntimeException("result is empty");
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        new Solution().twoSum(nums, target);
    }

}
