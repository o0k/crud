package cn.o0k.concurrency.chapter1;

/**
 * @author 张澎_9970
 * @DESCRIPTION:
 * @DATE: 2020/8/16 20:15 星期日
 */
public class TuYa {
	public static void main(String[] args) {
		new TuYa().mm();
		{
			System.out.println("I am code block.");
		}

	}

	public synchronized void mm() {

		System.out.println("synchronized");
	}
	// Small is power, small is beautiful!
}
