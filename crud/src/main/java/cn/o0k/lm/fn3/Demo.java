package cn.o0k.lm.fn3;

import java.util.function.Supplier;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 * <p>
 * <p>
 * Supplier<T>
 * 生产型接口,接口泛型是什么类型,那么接口中的get方法就会产生什么类型的数据,供我们使用.
 * <p>
 * T get()
 */
public class Demo {
    public static void main(String[] args) {
        String string = getString(() -> "Oregon");
        System.out.println(string);

        Integer integer = getInteger(() -> 78);
        System.out.println(integer);

    }

    /**
     * 返回一个Integer
     */
    private static Integer getInteger(Supplier<Integer> supplier) {
        return supplier.get();
    }

    /**
     * 返回一个字符串
     *
     * @param supplier
     * @return
     */
    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }
}
