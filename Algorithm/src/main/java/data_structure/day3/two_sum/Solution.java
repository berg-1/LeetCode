package data_structure.day3.two_sum;

import java.util.Arrays;

class Solution {

    /**
     * 利用好从小到达排序的特点
     * 利用双指针
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (right > left) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) right--;
            else left++;
        }
        return new int[]{-1, -1};
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
