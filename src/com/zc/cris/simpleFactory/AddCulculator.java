package com.zc.cris.simpleFactory;

/**
 * 实现加法运算的加法类
 * @author chongqingwuyifan
 *
 */
public class AddCulculator implements Culculator{

	@Override
	public int add(int i, int j) {
		return i+j;
	}
	
}
