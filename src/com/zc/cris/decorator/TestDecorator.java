package com.zc.cris.decorator;

//测试装饰者结合链式调用模式
public class TestDecorator {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Student student = new Student("cris");
		SpringDressUp springDressUp = new SpringDressUp();
		springDressUp.setPerson(student);
		// springDressUp.show();

		SummerDress summerDress = new SummerDress();
		summerDress.setPerson(springDressUp);
		// 这里使用了链式调用模式（充分利用多态性），summerDress的 show 方法里面先执行自己的装饰功能，
		// 然后调用 Person 引用（实际是springDressUp）的 show 方法，springDressUp的 show 方法里面先执行
		// 自己的装饰功能，然后调用 Person 引用（这才是 student）的原始 show 方法
		summerDress.show();

		System.out.println("--------------------");
		
		//自由组合穿衣搭配的风格，作为参数传入到 搭配方法中（还可以进一步结合简单工厂进一步简化客户端的操作）
		String[] strs = {"com.zc.cris.decorator.SpringDressUp", "com.zc.cris.decorator.SummerDress",
		"com.zc.cris.decorator.AutomDressUp" };
		myDressUp(student, strs);
	}

	/**
	 * 
	 * @MethodName: myDressUp
	 * @Description: TODO (通过反射实现链式调用的搭配方法)
	 * @param student
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @Return Type: void
	 * @Author: zc-cris
	 */
	public static void myDressUp(Student student, String[] strs)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		DressUp d = null;
		DressUp dressUp = null;
		for (int i = 0; i < strs.length; ++i) {
			if (i == 0) {
				d = (DressUp) Class.forName(strs[i]).newInstance();
				d.setPerson(student);
				continue;
			}
			dressUp = (DressUp) Class.forName(strs[i]).newInstance();
			dressUp.setPerson(d);
			d = dressUp;
		}
		d.show();
	}

}
