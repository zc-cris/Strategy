package com.zc.cris.twelfth.state.chain;

public class GreatState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.getWorkTime() < 2) {
			System.out.println("状态非常好！");
			staff.setWorkTime(3);
			staff.currentWorkState(new GoodState());
		}else {
			System.out.println("还没上班，赶紧上班！");
		}
	}

}
