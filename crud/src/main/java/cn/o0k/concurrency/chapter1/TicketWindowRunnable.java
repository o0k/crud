package cn.o0k.concurrency.chapter1;

/**
 * @author zhp_e
 */
public class TicketWindowRunnable implements Runnable {

	private int index = 1;
	private final static int MAX = 5000;

	@Override
	public void run() {
		while (index <= MAX) {
			System.out.println(Thread.currentThread()+"的号码是：" + index++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TicketWindowRunnable task = new TicketWindowRunnable();

		Thread win1 = new Thread(task, "一号窗");
		Thread win2 = new Thread(task, "二号窗");
		Thread win3 = new Thread(task, "三号窗");
		Thread win4 = new Thread(task, "四号窗");

		win1.start();
		win2.start();
		win3.start();
		win4.start();

		/**
		 * 控制台打出了这个：
		 * Thread[三号窗,5,main]的号码是：4995
		 * Thread[四号窗,5,main]的号码是：4995
		 */
	}
}
