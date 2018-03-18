package com.zc.cris.sixth.templatemethod;

public class TestCase {

	//不同的子类实现相同的逻辑中的不同的细节，这就是模板方法模式的完美体现
	public static void main(String[] args) {
		Chinese chinese = new Chinese();
		chinese.eat();

		Indian indian = new Indian();
		indian.eat();

		Westerner westerner = new Westerner();
		westerner.eat();

	}

}
