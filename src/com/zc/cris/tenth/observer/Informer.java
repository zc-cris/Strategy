package com.zc.cris.tenth.observer;

import java.util.Set;

public interface Informer {
	
	
	// 添加一个观察者
	public void add(Observer observer);
	
	//移除一个观察者
	public void remove(Observer observer);
	
	//通知观察者们
	public void inform();
	
	//具体的通知信息
	public String informMessage();

}
