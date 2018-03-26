package com.zc.cris.fiteenfth.composite;

/**
 * 实现了部分方法的部门类
 * 
 * @author chongqingwuyifan
 *
 */
public class Department implements Company {

	private String name;

	@Override
	public void show(Integer num) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name) {
		super();
		this.name = name;
	}
}
