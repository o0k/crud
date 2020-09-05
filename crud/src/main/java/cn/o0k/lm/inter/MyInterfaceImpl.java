package cn.o0k.lm.inter;

/**
 * @DATE: 2020-09-05 星期六
 * @Author: Trader
 */
public class MyInterfaceImpl implements MyInterface {

    @Override
    public void show() {
        System.out.println("11111111");
    }

    @Override
    public void show2() {
        System.out.println("22222222");
    }

    /**
     * 重写show3()方法,
     * 不要用default了
     */
    @Override
    public void show3() {
        System.out.println("One show3");
    }
}
