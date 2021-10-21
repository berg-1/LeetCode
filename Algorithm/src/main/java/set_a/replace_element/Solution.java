package set_a.replace_element;

import java.util.Arrays;

/**
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 * 解释：
 * - 下标 0 的元素 --> 右侧最大元素是下标 1 的元素 (18)
 * - 下标 1 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 2 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 3 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 4 的元素 --> 右侧最大元素是下标 5 的元素 (1)
 * - 下标 5 的元素 --> 右侧没有其他元素，替换为 -1
 */
class Solution {
    public static int[] replaceElements(int[] arr) {
        int max;
        int[] res = new int[arr.length];
        max = arr[arr.length - 1];
        res[arr.length - 1] = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            res[i - 1] = max;
            if (arr[i - 1] > max) {
                max = arr[i - 1];
            }
            System.out.println("max = " + max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = replaceElements(new int[]{400});
        System.out.println(Arrays.toString(res));
    }
}
