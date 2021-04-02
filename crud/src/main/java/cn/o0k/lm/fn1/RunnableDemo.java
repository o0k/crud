package cn.o0k.lm.fn1;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "_主线程启动了..");
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "_线程启动了..");
            }
        });
        startThread(() -> System.out.println(Thread.currentThread().getName() + "_lm线程启动了.."));

    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
