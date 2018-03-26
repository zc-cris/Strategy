package com.zc.cris.fiteenfth.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现了全部方法的具体公司类
 * 
 * @author chongqingwuyifan
 *
 */
public class ConcreateCompany implements Company {

	private String name;
	private List<Company> list = new ArrayList<>();

	@Override
	public void show(Integer num) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println(this.name);
		for (Company company : list) {
			company.show(num+2);
		}
	}

	@Override
	public void add(Company company) {
		this.list.add(company);
	}

	@Override
	public void remove(Company company) {
		this.list.remove(company);
	}

	public ConcreateCompany(String name) {
		super();
		this.name = name;
	}

	public ConcreateCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
