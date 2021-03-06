package set_b.stone_game;

/**
 * 由于石子的堆数为偶数，对于先手而言：每一次的决策局面，都能「自由地」选择奇数还是偶数的序列，从而限制后手下一次「只能」奇数还是偶数石子。
 * <p>
 * 具体的，对于本题，由于石子堆数为偶数，因此先手的最开始局面必然是 [奇数, 偶数][奇数,偶数]，即必然是「奇偶性不同的局面」；当先手决策完之后，交到给后手的要么是 [奇数,奇数][奇数,奇数] 或者 [偶数,偶数][偶数,偶数]，即必然是「奇偶性相同的局面」；后手决策完后，又恢复「奇偶性不同的局面」交回到先手 ...
 * <p>
 * 不难归纳推理，这个边界是可以应用到每一个回合。
 * <p>
 * 因此先手只需要在进行第一次操作前计算原序列中「奇数总和」和「偶数总和」哪个大，然后每一次决策都「限制」对方只能选择「最优奇偶性序列」的对立面即可。
 * <p>
 * 同时又由于所有石子总和为奇数，堆数为偶数，即没有平局，所以先手必胜。
 */
class BestSolution {
    // 简单的博弈论
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
