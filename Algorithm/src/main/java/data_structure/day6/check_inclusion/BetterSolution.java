package data_structure.day6.check_inclusion;

public class BetterSolution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int len1 = ch1.length;
        int len2 = ch2.length;
        int left = 0;
        int right = 0;
        int[] counter = new int[26];
        for (char c : ch1) {
            counter[c - 'a']++;
        }
        while (left <= len2 - len1) {
            while (right - left < len1 && counter[ch2[right] - 'a'] >= 1) {
                counter[ch2[right] - 'a']--;
                right++;
            }
            if (right - left == len1) return true;
            counter[ch2[left] - 'a']++;
            left++;
        }
        return false;
    }
}

class Main2 {
    public static void main(String[] args) {
        BetterSolution solution = new BetterSolution();
        System.out.println(solution.checkInclusion("adc", "dcda"));
    }
}
