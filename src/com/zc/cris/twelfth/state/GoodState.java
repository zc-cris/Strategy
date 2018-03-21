package com.zc.cris.twelfth.state;

public class GoodState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.getWorkTime() < 4) {
			System.out.println("状态还行");
		}else {
			staff.setState(new GeneralState());
			staff.currentWorkState();
		}
	}

}
