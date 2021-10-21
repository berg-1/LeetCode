package data_structure.day6.check_inclusion;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int left = 0;
        int right = 0;
        if (n > m) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int[] charCount = new int[26];
        for (char c : ch1) {
            charCount[c - 'a']++;
        }
        // 依次尝试
        while (left <= m - n) {
            // 右边界s2[r]字符进入窗口【还账】
            while (right < left + n && charCount[ch2[right] - 'a'] >= 1) {
                charCount[ch2[right] - 'a']--; // 【"还账"】
                right++;
            }
            if (right - left == n) return true;
            // 左边界s2[l]字符出窗口【赊账】
            charCount[ch2[left] - 'a']++;  // 重新【"赊账"】
            left++;
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion("adc", "dcda"));
    }
}
