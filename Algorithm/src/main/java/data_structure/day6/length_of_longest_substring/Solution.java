package data_structure.day6.length_of_longest_substring;

import java.util.HashMap;

public class Solution {
    /**
     * 最长子串 - 滑动窗口
     */
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcabcd"));
    }
}
