package set_b.stone_game;

/**
 * 亚历克斯和李用<b>几堆石子</b>在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
 * <p>
 * 游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
 * <p>
 * 亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
 * <p>
 * 假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
 * <p>
 * 示例：
 * <p>
 * 输入：[5,3,4,5]
 * <p>
 * 输出：true
 * <p>
 * 解释：
 * <p>
 * 亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。<br/>
 * 假设他取了前 5 颗，这一行就变成了 [3,4,5] 。<br/>
 * 如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。<br/>
 * 如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。<br/>
 * 这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。<br/>
 */
public class Solution {
    public static boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] f = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) { // 枚举区间长度
            for (int l = 1; l + len - 1 <= n; l++) { // 枚举左端点
                int r = l + len - 1; // 计算右端点
                int a = piles[l - 1] - f[l + 1][r];
                int b = piles[r - 1] - f[l][r - 1];
                f[l][r] = Math.max(a, b);
            }
        }
        return f[1][n] > 0;
    }

    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{5, 3, 4, 5}));
    }
}
