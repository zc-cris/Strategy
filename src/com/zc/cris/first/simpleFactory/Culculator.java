package com.zc.cris.first.simpleFactory;

/**
 * jdk8 以后的接口可以使用 default 修饰符实现方法
 * @author chongqingwuyifan
 *
 */
public interface Culculator {

	
	default int add(int i, int j) {
		return 0;
	}
	
	default int sub(int i, int j) {
		return 0;
	}
	
}
