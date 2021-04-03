package cn.o0k.lm.ref2;


/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(i -> System.out.println(i));
        usePrintable(System.out::println);

    }
    private static void usePrintable(Printable p){
        p.printString(6666);
    }
}
