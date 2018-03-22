package com.zc.cris.twelfth.state.chain;

public class GoodState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.getWorkTime() < 4) {
			System.out.println("状态还行");
			staff.setWorkTime(6);
			staff.setWorkProgress(true);
			staff.currentWorkState(new GeneralState());
		}else {
			
		}
	}

}
