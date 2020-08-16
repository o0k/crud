package cn.o0k.concurrency.chapter1;

/**
 * @author zhp_e
 */
public class TicketWindow extends Thread {

	private String win;
	private final int MAX = 50;
	private static int index = 1;

	public TicketWindow(String win) {
		this.win = win;
	}

	@Override
	public void run() {
		while (index <= MAX) {
			System.out.println("窗口：" + win + "，正在售 " + index++);
		}
	}

	public static void main(String[] args) {
		TicketWindow t1 = new TicketWindow("一号窗");
		t1.start();
		TicketWindow t2 = new TicketWindow("二号窗");
		t2.start();
		TicketWindow t3 = new TicketWindow("三号窗");
		t3.start();
		TicketWindow t4 = new TicketWindow("四号窗");
		t4.start();
	}
}
