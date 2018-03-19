package com.zc.cris.tenth.observer;

public class Teacher implements Observer {

	private String name;
	//持有统治者的引用
	private Informer informer;

	public Teacher(String name, Informer informer) {
		super();
		this.name = name;
		this.informer = informer;
	}

	// 根据通知者的通知，进行不同的改变
	@Override
	public void update() {
		System.out.println(informer.informMessage() + this.name +"备课");

	}

}
