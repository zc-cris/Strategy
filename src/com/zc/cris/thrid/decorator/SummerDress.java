package com.zc.cris.thrid.decorator;

//定义穿衣服父类的子类 b
public class SummerDress extends DressUp {

	@Override
	public void show() {
		System.out.println("穿夏装");
		person.show();
	}

}
