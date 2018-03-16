package com.zc.cris.fourth.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCulculator {

	@Test
	void testAddCulculatorFactory() {
		ICulculatorFactory culculatorFactory = new AddCulculatorFactory();
		Culculator culculator = culculatorFactory.createCulculator();
		int result = culculator.add(1, 3);
		//使用断言判断
		assertEquals(4, result);
	}
	
	@Test
	void testSub() {
		ICulculatorFactory culculatorFactory = new SubCulculatorFactory();
		Culculator culculator = culculatorFactory.createCulculator();
		int result = culculator.sub(1, 3);
		//使用断言判断
		assertEquals(-2, result);
	}

}
