package data_structure.day2.sorted_squares;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int pos = n - 1;
        int j = n - 1;
        int i = 0;
        int[] ans = new int[n];
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                i++;
            } else {
                ans[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return ans;
    }
}


class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
