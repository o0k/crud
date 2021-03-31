package cn.o0k.lm.inter;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class MyTest {
    public static void main(String[] args) {
        MyInterface my = new MyInterfaceImpl();
        my.show();
        my.show2();
        my.show3();
        // 接口调用static方法,实现类都不可以调用.
        MyInterface.staticMethod();


        MyInterface my2 = new MyInterfaceImpl2();
        my2.show();
        my2.show2();
    }
}
