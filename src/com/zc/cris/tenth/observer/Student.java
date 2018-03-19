package com.zc.cris.tenth.observer;

public class Student implements Observer {

	private String name;
	private Informer informer;

	public Student(String name, Informer informer) {
		super();
		this.name = name;
		this.informer = informer;
	}

	@Override
	public void update() {
		System.out.println(informer.informMessage() + this.name + "玩耍");
	}

}
