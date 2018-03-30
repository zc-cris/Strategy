package com.zc.cris.seventeenth.singleton;

/**
 * 懒汉式单例
 * 
 * @author chongqingwuyifan
 *
 */
public class LazySingleton {

	private static volatile Factory facotry;

	private LazySingleton() {
	}

	/**
	 * 必须使用双重锁定，解决多线层并发问题
	 * @return
	 */
	public static Factory getFactoryInstance() {
		if (facotry == null) {
			synchronized (LazySingleton.class) {
				if (facotry == null) {
					facotry = new Factory();
					System.out.println("zc-cris");
				}
			}
		}
		return facotry;
	}

}
