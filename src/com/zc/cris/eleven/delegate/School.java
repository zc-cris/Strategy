package com.zc.cris.eleven.delegate;


// 学校只负责向委派对象发出通知，至于谁执行一概不管
public class School implements Informer{
	
	@Override
	public void inform(Delegator delegator) {
		delegator.delegate(this);
	}

	public String informMessage() {

		return "学校放国庆了";
	}
}
