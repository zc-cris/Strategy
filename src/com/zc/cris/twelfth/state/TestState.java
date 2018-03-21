package com.zc.cris.twelfth.state;

public class TestState {

	public static void main(String[] args) {
		
		Staff staff = new Staff();
		staff.currentWorkState();
		
		staff.setWorkTime(3);
		// 必须再调用一次方法，执行 State 类的判断才可以继续进行下去
		staff.currentWorkState();
//		
//		staff.setWorkTime(6);
//		staff.setWorkProgress(true);
//		staff.currentWorkState();
	
		staff.setWorkTime(7);
		staff.currentWorkState();
		
		
		
	}
	
}
