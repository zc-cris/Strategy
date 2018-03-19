package com.zc.cris.eleven.delegate;


public class School implements Informer{
	
	
	@Override
	public void inform(Delegator delegator) {
		delegator.delegate(this);
	}

	public String informMessage() {

		return "学校放国庆了";
	}
}
