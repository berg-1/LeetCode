package data_structure.day1.version_control;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(5));
    }
}
