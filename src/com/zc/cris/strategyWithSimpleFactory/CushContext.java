package com.zc.cris.strategyWithSimpleFactory;

public class CushContext {

	private static CushStrategy STRATEGY;

	//根据客户端的信息选择不同的折扣策略
	public static void judgeStrategy(String message) {
		switch (message) {
		case "八折":
			STRATEGY = new CushStrategyB();
			break;

		case "超过300的部分打六折":
			STRATEGY = new CushStrategyC();
			break;

		default:
			STRATEGY = new CushStrategyA();
			break;
		}
	}
	
	//对客户端公开的调用方法返回实际付款金额
	public static Double realMoney(Double money) {
		return STRATEGY.returnCush(money);
	}
}
