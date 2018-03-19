package com.zc.cris.eleven.delegate;

public class Student implements Observer {

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Informer informer) {
		System.out.println(informer.informMessage() + this.name + "玩耍");
	}

}
