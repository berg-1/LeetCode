package set_b.find_max_length;

import java.util.HashMap;

/**
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [0,1]
 * <p>
 * 输出: 2
 * <p>
 * 说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [0,1,0]
 * <p>
 * 输出: 2
 * <p>
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。
 */
class Solution {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // 前缀和+HashMap
        // 初始下标 -1 , 哨兵点,当起始区间的和是0的时候,用到哨兵
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            // 对于区间求和, 如果sum-0 == sum1 存在map中,相当于sum - sum1 = 0
            // 那么这一段区间之和就是0
            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum));
            } else {
                map.put(sum, i);
                System.out.println(map);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = findMaxLength(new int[]{0, 0, 0, 1, 1, 1, 0});
        System.out.println(res);
    }
}
