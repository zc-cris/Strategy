package com.zc.cris.eleven.delegate;

import java.util.HashSet;
import java.util.Set;

public class Delegator {
	
	private Set<Observer> observers = new HashSet<>();
	
	public void add(Observer observer) {
		this.observers.add(observer);
	}
	
	public void delegate(Informer informer) {
		for (Observer observer : observers) {
			observer.update(informer);
		}
	}

}
