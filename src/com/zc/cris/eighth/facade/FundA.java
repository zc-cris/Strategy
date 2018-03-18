package com.zc.cris.eighth.facade;

/**
 * 基金 A 来决定如何将投资人的钱进行炒股
 * @author chongqingwuyifan
 *
 */
public class FundA implements Fund {

	private Stock stock1;
	private Stock stock2;
	
	@Override
	public void buy() {
		stock1 = new StockA();
		stock2 = new StockB();
		stock1.buy();
		stock2.buy();
	}

	@Override
	public void sale() {
		stock1.sale();
	}

}
