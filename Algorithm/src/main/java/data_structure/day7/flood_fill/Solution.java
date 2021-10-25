package data_structure.day7.flood_fill;

import java.util.Arrays;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int newColor, int oldColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length) {
            return;
        }
        if (image[x][y] != oldColor || image[x][y] == newColor) {
            return;
        }
        image[x][y] = newColor;
        dfs(image, x - 1, y, newColor, oldColor);
        dfs(image, x + 1, y, newColor, oldColor);
        dfs(image, x, y - 1, newColor, oldColor);
        dfs(image, x, y + 1, newColor, oldColor);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.floodFill(new int[][]{new int[]{1, 1, 1},
                new int[]{1, 1, 0}, new int[]{1, 0, 1}}, 1, 1, 2)));
    }
}
