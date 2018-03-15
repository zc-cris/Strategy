package com.zc.cris.strategyWithSimpleFactory;

public class CushStrategyC implements CushStrategy {

	@Override
	public Double returnCush(Double money) {
		
		//超过300的部分打六折
		if(money > 300) {
			money = (money - 300)*0.6 + 300;
		}
		
		return money;
	}

	

}
