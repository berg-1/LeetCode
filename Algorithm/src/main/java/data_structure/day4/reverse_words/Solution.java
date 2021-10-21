package data_structure.day4.reverse_words;


class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int left = 0;
        int right = 0;
        while (right <= n) {
            if (right == n || chars[right] == ' ') {
                reverseWord(chars, left, right - 1);
                left = right + 1;
            }
            right++;
        }
        return new String(chars);
    }

    private void reverseWord(char[] chars, int left, int right) {
        while (left < right) {
            chars[left] ^= chars[right];
            chars[right] ^= chars[left];
            chars[left] ^= chars[right];
            left++;
            right--;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }
}
