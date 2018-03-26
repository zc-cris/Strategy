package com.zc.cris.fiteenfth.composite;

/*
 * 定义一个总公司接口
 */
public interface Company {

	public void show(Integer num);

	default void add(Company company) {
	}

	default void remove(Company company) {
	}

}
