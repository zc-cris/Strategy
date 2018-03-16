package com.zc.cris.thrid.decorator;

//定义穿衣服父类的子类 a
public class SpringDressUp extends DressUp{

	
	@Override
	public void show() {
		System.out.println("穿春装");
		person.show();
	}
}
