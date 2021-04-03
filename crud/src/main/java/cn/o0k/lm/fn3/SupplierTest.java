package cn.o0k.lm.fn3;

import java.util.function.Supplier;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {98, 85, 100, 1, 8, 253};

        int m = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(m);
    }

    private static int getMax(Supplier<Integer> supplier) {

        return supplier.get();
    }
}
