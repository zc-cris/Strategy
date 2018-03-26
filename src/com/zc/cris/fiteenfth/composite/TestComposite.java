package com.zc.cris.fiteenfth.composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void test() {
		Company root = new ConcreateCompany("总公司");
		Company BJCompany = new ConcreateCompany("北京分公司");
		Company SHCompany = new ConcreateCompany("上海分公司");
		
		Company FinanceDeparment = new Department("总部财务部");
		Company BJFinanceDeparment  = new Department("北京财务部");
		Company SHFinanceDeparment = new Department("上海财务部");
		
		Company HRDeparment = new Department("总部人事部");
		Company BJHRDeparment = new Department("北京人事部");
		Company SHHRDeparment = new Department("上海人事部");
		
		BJCompany.add(BJFinanceDeparment);
		BJCompany.add(BJHRDeparment);
		
		SHCompany.add(SHHRDeparment);
		SHCompany.add(SHFinanceDeparment);
		
		// 为了体现良好的树形图关系，这里的 add 顺序必须从上往下一层一层的添加
		root.add(HRDeparment);
		root.add(FinanceDeparment);
		root.add(SHCompany);
		root.add(BJCompany);
		
		root.show(1);
		
	}
}
