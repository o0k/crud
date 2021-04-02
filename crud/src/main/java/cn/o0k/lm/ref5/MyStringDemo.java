package cn.o0k.lm.ref5;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((String s,int x,int y) ->{
            return s.substring(x,y);
        });
        useMyString((s,x,y) -> s.substring(x,y));
        useMyString(String::substring);
        /**
         * 类的实例方法,
         * 第一个参数:调用者
         * 后面的参数:全部传递给该方法
         *
         */
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("0123456789", 2, 5);
        System.out.println(s);

    }


}
