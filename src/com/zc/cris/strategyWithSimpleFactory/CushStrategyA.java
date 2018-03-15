package com.zc.cris.strategyWithSimpleFactory;

public class CushStrategyA implements CushStrategy {

	@Override
	public Double returnCush(Double money) {
		
		//原价，没有优惠信息
		return money;
	}

	

}
