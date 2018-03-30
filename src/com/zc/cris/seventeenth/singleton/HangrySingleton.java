package com.zc.cris.seventeenth.singleton;

/**
 * 饿汉式单例
 * 
 * @author chongqingwuyifan
 *
 */
public class HangrySingleton {

	private HangrySingleton() {
	}

	private static volatile HangrySingleton hangrySingleton = new HangrySingleton();

	public static HangrySingleton newInstance() {
		return hangrySingleton;
	}

}
