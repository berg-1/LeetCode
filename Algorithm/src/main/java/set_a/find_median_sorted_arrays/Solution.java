package set_a.find_median_sorted_arrays;

import java.util.Arrays;

public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int cLen = nums1.length + nums2.length;
        int[] c;
        double res;
        c = Arrays.copyOf(nums1, cLen);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
        if (cLen == 1) {
            return c[0];
        }
        merge_sort(c);
        if (cLen % 2 == 0) {
            res = (c[cLen / 2 - 1] + c[cLen / 2] + 0.0) / 2;
        } else {
            res = c[cLen / 2];
        }
        return res;
    }

    public static void merge_sort(int[] arr) {
        int[] orderedArr = new int[arr.length];
        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left, l = left, m = mid;
                while (l < mid && m <= right) {
                    if (arr[l] < arr[m]) {
                        orderedArr[start++] = arr[l++];
                    } else {
                        orderedArr[start++] = arr[m++];
                    }
                }
                while (l < mid)
                    orderedArr[start++] = arr[l++];
                while (m <= right)
                    orderedArr[start++] = arr[m++];
                System.arraycopy(orderedArr, left, arr, left, right - left + 1);
            }
        }
    }

    public static void main(String[] args) {
        double res = findMedianSortedArrays(new int[]{2,4,5}, new int[]{1});
        System.out.println(res);
    }
}
