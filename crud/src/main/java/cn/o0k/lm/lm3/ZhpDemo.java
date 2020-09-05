package cn.o0k.lm.lm3;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @PACKAGE_NAME: cn.o0k.lm.lm3
 * @NAME: ZhpDemo
 * @USER: Administrator
 * @DATE: 2020-09-05
 * @TIME: 22:19
 * @YEAR: 2020
 * @MONTH: 09
 * @MONTH_NAME_SHORT: 9月
 * @MONTH_NAME_FULL: 九月
 * @DAY: 05
 * @DAY_NAME_SHORT: 周六
 * @DAY_NAME_FULL: 星期六
 * @HOUR: 22
 * @MINUTE: 19
 * @PROJECT_NAME: crud
 * @Author: Trader
 */
public class ZhpDemo {
    public static void main(String[] args) {
        useInter(()->{
            System.out.println("sshow");
        });
        System.out.println("===1==");
        useInter(System.out::println);
        System.out.println("===2==");

        Runnable runnable = System.out::println;
        BiFunction<String, Integer, Integer> stringIntegerIntegerBiFunction = Integer::parseInt;
        Function<String, String> trim = String::trim;
        Runnable runnable1 = Date::new;
        Function<Date, String> dateStringFunction = Date::toString;
        Function<Date, Long> getTime = Date::getTime;


    }

    private static void useInter(Inter inter){
        inter.show();
    }
}
