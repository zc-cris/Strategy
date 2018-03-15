package com.zc.cris.strategyWithSimpleFactory;

public class TestStrategy {

	//客户端只需要告诉后台需要什么打折策略，以及传入金额即可获取对应的折扣后的金额，将逻辑处理和策略处理统统交给后台，简洁方便
	public static void main(String[] args) {
		CushContext.judgeStrategy("八折");
		Double realMoney = CushContext.realMoney(1000.0);
		System.out.println(realMoney);		//800.0
		
		CushContext.judgeStrategy("原价");
		realMoney = CushContext.realMoney(1000.0);
		System.out.println(realMoney);		//1000.0
		
		CushContext.judgeStrategy("超过300的部分打六折");
		realMoney = CushContext.realMoney(1000.0);
		System.out.println(realMoney);		//720.0
		
		
		
		
	}
	
	
	
}
