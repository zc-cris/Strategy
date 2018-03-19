package com.zc.cris.eleven.delegate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDelegate {

	@Test
	void test() {
		// 创建一个委派类
		Delegator delegator = new Delegator();
		delegator.add(new Teacher("王老师"));
		delegator.add(new Student("cris"));
		
		Informer informer = new School();
		informer.inform(delegator);
		
	}

}
