package cn.o0k.concurrency.chapter1;

// import static java.lang.Thread.sleep;
// import java.lang.Thread.sleep;

import java.util.concurrent.TimeUnit;

/**
 * @author zhp_e
 */
public class TryConcurrency {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println();

		new Thread(TryConcurrency::browseNews).start();
		enjoyMusic();
	}

	private static void enjoyMusic() {
		for (; ; ) {
			System.out.println("music");
			sleep(1);

		}
	}

	private static void browseNews() {
		for (; ; ) {
			System.out.println("News");
			sleep(1);

		}
	}

	private static void sleep(int seconds) {

		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
