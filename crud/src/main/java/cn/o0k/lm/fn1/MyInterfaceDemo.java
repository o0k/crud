package cn.o0k.lm.fn1;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = () -> System.out.println("函数式接口..");
        my.show();



    }
}
