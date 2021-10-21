package set_a.two_sum;

import java.util.*;

class Solution {
    /**
     * HashTable : <数字, 位于原始数组的位置>
     * 例如：
     * nums: 7, 2, 11, 15
     * target: 9
     * result: [0, 1]
     * <p>
     * 时间复杂度：O(N)
     * 空间复杂度：O(N)
     *
     * @param nums   数组
     * @param target 目标相加结果
     * @return 结果的下标
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] index = twoSum(new int[]{7, 2, 11, 15}, 9);
        System.out.println(Arrays.toString(Arrays.stream(index).toArray()));
    }
}
