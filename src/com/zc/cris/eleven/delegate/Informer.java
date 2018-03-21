package com.zc.cris.eleven.delegate;

// 通知者接口定义发出通知的方法
public interface Informer {

	public String informMessage();

	void inform(Delegator delegator);
	
}
