package data_structure.day1.search_insert;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        int ans = nums.length;  // 大于所有，最终返回据i
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= target){
                high = mid - 1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
}
