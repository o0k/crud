package learn.algorithms;

import java.util.Arrays;

/**
 * @author 张澎_9970
 * @date 2021.5.4 下午 3:45 星期二
 * @desc: 移动零到末尾, 其他数字,位置保持不变.
 *
 */
public class _283_MoveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] newArr = new int[arr.length];
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                newArr[i - zeroCount] = arr[i];
            }
        }
    }
}
