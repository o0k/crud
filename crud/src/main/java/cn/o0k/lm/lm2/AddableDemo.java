package cn.o0k.lm.lm2;

import java.util.Comparator;

/**
 * @PACKAGE_NAME: cn.o0k.lm.lm2
 * @NAME: AddableDemo
 * @USER: Administrator
 * @DATE: 2020-09-05
 * @TIME: 17:35
 * @YEAR: 2020
 * @MONTH: 09
 * @MONTH_NAME_SHORT: 9月
 * @MONTH_NAME_FULL: 九月
 * @DAY: 05
 * @DAY_NAME_SHORT: 周六
 * @DAY_NAME_FULL: 星期六
 * @HOUR: 17
 * @MINUTE: 35
 * @PROJECT_NAME: crud
 * @Author: Trader
 */
public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int x, int y) -> {return x + y;});
        // 1.参数类型,可以省略,多个参数,小括号不可省略.
        useAddable((x, y) -> {return x + y;});
        // 2.return 可以省略 ★
        useAddable((x, y) ->  x + y);
        // 3.方法引用
        useAddable(Integer::sum);

        // 4.
        useAddable((x, y) ->  x + y + 50);
        // 5.
        useAddable((x, y) -> {
            System.out.println("事实是");
            return x+y;
        });
        // 6.这是啥呢?
        Comparator<Integer> sum = Integer::sum;
        // 7.



    }

    private static void useAddable(Addable addable) {
        int sum = addable.add(45, 37);
        System.out.println(sum);
    }
}
