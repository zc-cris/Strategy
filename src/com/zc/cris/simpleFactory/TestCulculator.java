package com.zc.cris.simpleFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCulculator {

	@Test
	void testAdd() {
		Culculator culculator = new CulculatorFactory().createCulculator("加法");
		int result = culculator.add(1, 3);
		//使用断言判断
		assertEquals(4, result);
	}
	
	@Test
	void testSub() {
		Culculator culculator = new CulculatorFactory().createCulculator("减法");
		int result = culculator.sub(1, 3);
		//使用断言判断
		assertEquals(-2, result);
	}

}
