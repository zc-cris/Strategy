package com.zc.cris.eighth.facade;

public class StockB implements Stock {

	@Override
	public void sale() {
		System.out.println("卖股票 StockB");
	}

	@Override
	public void buy() {
		System.out.println("买股票 StockB");
	}



	
	
}
