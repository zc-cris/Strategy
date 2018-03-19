package com.zc.cris.eleven.delegate;

public class Teacher implements Observer {

	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	// 根据通知者的通知，进行不同的改变
	@Override
	public void update(Informer informer) {
		System.out.println(informer.informMessage() + this.name +"备课");

	}

}
