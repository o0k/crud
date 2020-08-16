package com.wangwenjun.concurrent.chapter04;

import java.util.concurrent.TimeUnit;

/**
 * @author 张澎_9970
 * @DESCRIPTION:
 * @DATE: 2020/8/16 21:21 星期日
 */
public class Mutex {
	private final static Object MUTEX = new Object();
	public void accessResource() {
		synchronized (MUTEX) {
			try {
				TimeUnit.MINUTES.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Mutex().accessResource();
	}
}
