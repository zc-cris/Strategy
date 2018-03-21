package com.zc.cris.eleven.delegate;

import java.util.HashSet;
import java.util.Set;

// 委派对象收到通知者的通知同时调用观察者们的应答方法
public class Delegator {
	
	private Set<Observer> observers = new HashSet<>();
	
	public void add(Observer observer) {
		this.observers.add(observer);
	}
	
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void delegate(Informer informer) {
		for (Observer observer : observers) {
			observer.update(informer);
		}
	}

}
