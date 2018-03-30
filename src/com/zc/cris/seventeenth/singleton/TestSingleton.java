package com.zc.cris.seventeenth.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSingleton {

	@Test
	void testHangry() {
		HangrySingleton hangrySingleton = HangrySingleton.newInstance();
		HangrySingleton hangrySingleton2 = HangrySingleton.newInstance();
		System.out.println(hangrySingleton == hangrySingleton2); // true
	}

	/**
	 * junit 测试多线程貌似有点问题
	 */
	@Test
	void testLazy() {

//		Factory factory = LazySingleton.getFactoryInstance();
//		Factory factory1 = LazySingleton.getFactoryInstance();
//		System.out.println(factory == factory1);
		
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread, "a");
		Thread thread2 = new Thread(myThread, "b");
		Thread thread3 = new Thread(myThread, "c");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
