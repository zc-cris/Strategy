package com.zc.cris.seventeenth.singleton;

public class MyThread implements Runnable{

	@Override
	public void run() {
		LazySingleton.getFactoryInstance();
	}

}
