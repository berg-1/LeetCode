package data_structure.day2.rotate;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums, int i, int j) {
        int temp;
        for (; i < j; i++, j--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[]{1, 2, 3, 4, 5, 6}, 2);
    }
}
