package cn.o0k.lm.fn4;

import java.util.function.Consumer;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 * <p>
 * 消费型接口，消费的数据的类型由泛型指定
 * <p>
 * Comsumer<T>
 * accept(T t)
 */
public class ComsumerDemo {
    public static void main(String[] args) {
        //
        operatorString("液晶屏表面膜", (String s) -> {
            System.out.println(s);
        });
        //
        operatorString("液晶屏表面膜", System.out::println);

        operatorString("液晶屏表面膜", s -> {
            String s1 = new StringBuilder(s).reverse().toString();
            System.out.println(s1);
        });
        operatorString("林清玄", System.out::println, s -> System.out.println(new StringBuilder(s).reverse().toString()));


    }

    /**
     * 定义一个方法， 用不同的方式，消费同一个字符串数据两次
     * 写法1:
     * consumer1.accept(name);
     * consumer2.accept(name);
     * 写法2:
     * consumer1.andThen(consumer2).accept(name);
     */
    private static void operatorString(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
        consumer1.andThen(consumer2).accept(name);


    }

    /**
     * 定义一个方法， 消费一个字符串数据
     */
    private static void operatorString(String name, Consumer<String> consumer) {
        /**
         * 具体怎么消费，有lambda表达式决定
         */
        consumer.accept(name);
    }
}
