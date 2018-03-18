package com.zc.cris.sixth.templatemethod;

/**
 * 抽象类定义一个吃饭的顶级逻辑，其中使用餐具的方法抽取出来作为抽象方法由不同子类实现
 * @author chongqingwuyifan
 *
 */
public abstract class People {
	
	public abstract void eatWithTableware();
	
	public void eat() {
		eatWithTableware();
	}
	
}
