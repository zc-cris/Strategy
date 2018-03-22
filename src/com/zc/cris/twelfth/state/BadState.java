package com.zc.cris.twelfth.state;

public class BadState implements State {

	@Override
	public void handle(Staff staff) {
		
		if(staff.isWorkProgress() == true && staff.getWorkTime() < 10) {
			System.out.println("准时下班，拼了老命才完成任务，希望不要有太多 bug，如来佛主保佑！阿门！");
		}else {
			staff.setState(new TerribleState());
			staff.currentWorkState();
		}
		
	}

}
