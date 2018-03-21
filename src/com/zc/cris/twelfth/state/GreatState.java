package com.zc.cris.twelfth.state;

public class GreatState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.getWorkTime() < 2) {
			System.out.println("状态非常好！");
		}else {
			// 改变职工持有的状态类引用
			staff.setState(new GoodState());
			staff.currentWorkState();
		}
	}

}
