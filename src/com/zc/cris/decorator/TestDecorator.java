package com.zc.cris.decorator;

//测试装饰者结合链式调用模式
public class TestDecorator {

	public static void main(String[] args) {
		Student student = new Student("cris");
		SpringDressUp springDressUp = new SpringDressUp();
		springDressUp.setPerson(student);
		springDressUp.show();
		
		SummerDress summerDress = new SummerDress();
		summerDress.setPerson(springDressUp);
		//这里使用了链式调用模式（充分利用多态性），summerDress的 show 方法里面先执行自己的装饰功能，
		//然后调用 Person 引用（实际是springDressUp）的 show 方法，springDressUp的 show 方法里面先执行
		//自己的装饰功能，然后调用 Person 引用（这才是 student）的原始 show 方法
		summerDress.show();
	}
	
}
