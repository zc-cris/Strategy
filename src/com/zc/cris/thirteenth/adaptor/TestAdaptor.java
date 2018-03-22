package com.zc.cris.thirteenth.adaptor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdaptor {

	// 需要调用外部接口的实现类和我们自己的接口冲突的时候（功能类似），可以考虑使用适配器模式
	// 客户端根本不知道调用的到底是谁（适配器的功能由被适配兑现实现）
	@Test
	void test() {
		Pay pay = new MyPayAdaptor();
		pay.pay();
	}

}
