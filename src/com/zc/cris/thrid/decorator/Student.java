package com.zc.cris.thrid.decorator;

/**
 * 定义接口的实现类，其中穿衣服的功能根据不同的时节需要改变（被装饰）
 * @author chongqingwuyifan
 *
 */
public class Student implements Person {

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
	}

	//只对穿衣服进行基础的实现
	@Override
	public void show() {
		System.out.println(this.name+"在打扮");
	}

}
