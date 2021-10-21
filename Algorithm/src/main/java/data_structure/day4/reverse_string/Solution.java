package data_structure.day4.reverse_string;

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
           int  j = n - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
        System.out.println(Arrays.toString(s));
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
