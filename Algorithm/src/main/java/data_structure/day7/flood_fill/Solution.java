package data_structure.day7.flood_fill;

import java.util.Arrays;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return image;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.floodFill(new int[][]{new int[]{1, 1, 1},
                new int[]{1, 1, 0}, new int[]{1, 0, 1}}, 1, 1, 2)));
    }
}
