package set_a.length_of_longest_substring;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Berg
 */
public class Solution {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     ? d
     ! das
     * @param s s = "abcabcbb"
     * @return 3
     */
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < (s.length() - max); i++) {
            int cMax = 0;
            List<Character> chars = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (!chars.contains(s.charAt(j))) {
                    chars.add(s.charAt(j));
                    cMax++;
                } else {
                    break;
                }
                if (cMax > max) max = cMax;
            }
            System.out.println(chars);
            chars.clear();
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
