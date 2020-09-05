package cn.o0k.lm.inter;

/**
 * @DATE: 2020-09-05 星期六
 * @Author: Trader
 */
public interface MyInterface {
    void show();
    void show2();

    /**
     * 被迫添加了新功能
     * 那么实现了这接口的类,都要重写该方法,
     * ------>>>>>>>>>否则就会报错.
     *
     * 接口升级,我只好再定义一个新的接口.
     * 继承该接口, extends
     *
     * 然后让需要升级的实现类, 再实现一下该接口就可以了,","
     *
     * 但,还是有问题的,添加一个功能,就要添加衣蛾这样的子接口,
     *
     * java8后提供 默认方法,更好.
     *
     */
    // void show3();

    /**
     * 默认方法,是不强制,实现类重写该方法的.
     */
    public default void show3(){
        System.out.println("默认方法 show() ");
    }

    /**
     * 接口中的静态方法
     *
     * 静态方法,只能被接口调用.
     */
    public static void staticMethod() {
        System.out.println("静态方法 staticMethod()");
    }
    /**
     * 私有方法
     */
    private void privateMethod() {
        System.out.println("私有方法 privateMethod() ");
    }
    /**
     * 私有 静态 方法
     */
    private static void priStatMethod(){
        System.out.println("priStatMethod()");
    }
    /**
     * 默认方法,可以调用,私有的静态方法 和 非静态方法.
     * 静态方法 只能调用私有的静态方法.
     */
}
