package SunFa;

/**
 * @author 张澎_9970
 * @date 2021-04-03 21:40 星期六
 * @desc Algorithms: 算法
 */
public class Algorithms {

    static int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    public static void main(String[] args) {
        System.out.println("算法");
        int i = maxArea(arr);
        System.out.println(i);
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
