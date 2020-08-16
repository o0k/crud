package com.wangwenjun.concurrent.chapter04;

/**
 * @author 张澎_9970
 * @DESCRIPTION:
 * @DATE: 2020/8/16 20:21 星期日
 */
public class TicketWindowRunnable implements Runnable {
	private int index = 1;
	private final static int MAX = 500;
	/**
	 * mutex:互斥，随便一个对象而已
	 */
	private final static Object MUTEX = new Object();

	@Override
	public void run() {
		synchronized (MUTEX) {
			while (index <= MAX) {
				System.out.println(Thread.currentThread() + " 的号码是："+ index++);
			}
		}
	}

	public static void main(String[] args) {
		final TicketWindowRunnable task = new TicketWindowRunnable();
		Thread w1 = new Thread(task, "一号窗口");
		Thread w2 = new Thread(task, "二号窗口");
		Thread w3 = new Thread(task, "三号窗口");
		Thread w4= new Thread(task, "四号窗口");

		w1.start();
		w2.start();
		w3.start();
		w4.start();
	}

}
