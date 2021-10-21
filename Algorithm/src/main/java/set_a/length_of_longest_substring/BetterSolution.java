package set_a.length_of_longest_substring;

import java.util.HashMap;

public class BetterSolution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, (i - left) + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
