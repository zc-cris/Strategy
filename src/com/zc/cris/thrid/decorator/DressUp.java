package com.zc.cris.thrid.decorator;

//定义一个穿衣服的类实现了接口
public class DressUp implements Person{

	//持有 protected 类型的接口引用，不仅是 Student 的穿衣服功能需要被修饰，如果还有 Teacher 类呢？
	//还有 Employee 类呢？
	protected Person person;

	//将需要被修饰的类传递进来，用接口来接收传进来的实现类，利用多态的向上转型实现接收参数的统一
	public void setPerson(Person person) {
		this.person = person;
	}

	//需要被装饰的方法
	public void show() {
		if (this.person != null) {
			//调用不同实现类的被修饰方法的最基本实现
			this.person.show();
		}
	}

}
