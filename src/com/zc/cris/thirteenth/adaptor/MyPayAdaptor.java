package com.zc.cris.thirteenth.adaptor;

/**
 * 定义一个适配器为调用外界的类进行适配
 * @author chongqingwuyifan
 *
 */
public class MyPayAdaptor implements Pay{

	private BOC_pay boc_pay = new BOC_pay();
	
	@Override
	public void pay() {
		boc_pay.bocPay();
	}

}
