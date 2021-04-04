package SunFa;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Arrays;

/**
 * @author 张澎_9970
 * @date 2021-04-03 21:40 星期六
 * @desc Algorithms: 算法
 */
public class Algorithms {

    static int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    static int[] a = new int[2];

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();

        int[] ints = algorithms.twoSum(arr, 10);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 1.
     * 两数之和
     */
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[0];
    }

    /**
     * 15.
     * 三数之和
     */





    /**
     * 最近重复子问题
     * 1. 1 + 1 + 1
     * 2. 1 + 2
     * 3. 2 + 1
     *
     * 核心问题: 你来到这个台阶的方法, 从前面一个台阶, 或者从前面2个台阶.
     * 解题: 只要最后的三个值:
     *      result = f1 + f2
     *      f1 = f2
     *      f2 = result
     *
     *      1.暴力
     *      2.最简单的情况怎么解决
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * 盛最多水的容器_11
     *
     * @param arr 数组
     * @return int
     */
    public static int maxArea(int[] arr) {
        /** 前柱子 和 后柱子 下标 */
        int l = 0, r = arr.length - 1;
        /** 大面积 */
        int ans = 0;
        while (l < r) {
            int area = Math.min(arr[l], arr[r]) * (r - l);
            ans = Math.max(ans, area);
            if (arr[l] <= arr[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
