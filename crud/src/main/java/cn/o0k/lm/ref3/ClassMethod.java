package cn.o0k.lm.ref3;

import java.util.function.BiFunction;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class ClassMethod {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> stringIntegerIntegerBiFunction = Integer::parseInt;
        /**
         * 字符串 转成 int
         */
        useConvert((String s) -> Integer.parseInt(s));
        useConvert(Integer::parseInt);


    }

    private static void useConvert(Converter c){
        int number = c.convert("666");
        System.out.println(number);

    }
}
