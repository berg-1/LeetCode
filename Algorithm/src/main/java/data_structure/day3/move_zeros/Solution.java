package data_structure.day3.move_zeros;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes2(int[] nums) {
        int[] swap = new int[nums.length];
        int cnt = 0;
        for (int num : nums) {
            if (num != 0) swap[cnt++] = num;
        }
        nums = swap;
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 双指针
     */
    public void moveZeroes3(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeros4(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
                continue;
            }
            nums[i - cnt] = nums[i];
        }
        while (cnt > 0) {
            nums[nums.length - cnt] = 0;
            cnt--;
        }
    }

    public void swap(int[] nums, int left, int right) {
        if (left != right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes3(new int[]{0, 0, 23, 0, 3, 12, 0, 0});
    }
}
