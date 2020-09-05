package cn.o0k.lm.ref2;

import cn.o0k.lm.ref.Printable;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable((String s) -> {
            System.out.println("s:" + s);
        });
        usePrintable(s-> System.out.println("s" + s));
        // 可推到的,就是可省略的
        usePrintable(System.out::print);
        usePrintable(System.out::println);

    }
    private static void usePrintable(Printable p){
        p.printString("爱生活,爱java");
    }
}
