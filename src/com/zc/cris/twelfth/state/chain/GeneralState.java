package com.zc.cris.twelfth.state.chain;

public class GeneralState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.getWorkTime() < 8 && staff.isWorkProgress() == true) {
			System.out.println("状态一般般,好在任务完成了，可以准时下班了");
		}else {
		}
	}

}
