package com.zc.cris.eighth.facade;

public class StockA implements Stock {

	@Override
	public void sale() {
		System.out.println("卖股票 StockA");
	}

	@Override
	public void buy() {
		System.out.println("买股票 StockA");
	}



	
	
}
