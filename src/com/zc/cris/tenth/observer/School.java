package com.zc.cris.tenth.observer;

import java.util.HashSet;
import java.util.Set;

public class School implements Informer {

	//持有一系列观察者的集合
	private Set<Observer> observers = new HashSet<>();
	
	/**
	 * 添加一个观察者
	 */
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除 一个观察者
	 */
	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知观察者们
	 */
	@Override
	public void inform() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String informMessage() {

		return "学校放国庆了";
	}

}
