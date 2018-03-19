package com.zc.cris.eleven.delegate;

public interface Observer {
	
	//根据通知者的通知进行工作
	public void update(Informer informer);

}
