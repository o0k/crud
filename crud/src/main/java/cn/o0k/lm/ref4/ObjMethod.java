package cn.o0k.lm.ref4;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 *
 * 对象::成员方法
 * "HelloWorld"::toUpperCase
 *
 */
public class ObjMethod {
    public static void main(String[] args) {
        usePrint((String s) -> {
            String s1 = s.toUpperCase();
            System.out.println(s1);
        });
        usePrint(String::toUpperCase);
        usePrint((String s) -> System.out.println(s.toUpperCase()));
        usePrint(s -> System.out.println(s.toUpperCase()));
        /**
         * 上面的这些动作,其实PrintString类,已经处理好了,
         * 所以我用这个类的对象实例就可以干
         * 1.先创建一个对象
         * 2.
         */
        PrintString printString = new PrintString();
        usePrint(printString::printUpper);



    }

    public static void usePrint(Printer p){
        p.printUpperCase("HelloWorld");
    }


}
