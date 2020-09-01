package cn.o0k.concurrency.chapter1;

import java.util.concurrent.TimeUnit;

/**
 * @author 张澎_9970
 * @DESCRIPTION:
 * @DATE: 2020/8/16 20:15 星期日
 */
public class TuYa {
    public static void main(String[] args) {
        new TuYa().mm();
        {
            System.out.println("sleep two minutes.");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("22");
                e.printStackTrace();
            }
            System.out.println("It wakes.");
            System.out.println("I am code block.");
        }

    }

    public synchronized void mm() {

        System.out.println("synchronized");
    }
    // Small is power, small is beautiful!
}
