package com.zc.cris.twelfth.state;

public class BadState implements State {

	@Override
	public void handle(Staff staff) {
		
		if(staff.isWorkProgress() == false) {
			System.out.println("我去，又要加班了，任务好多啊，肿么办呐！");
			staff.setState(new TerribleState());
			staff.currentWorkState();
		}else {
			System.out.println("准时下班，拼了老命才完成任务，希望不要有太多 bug，如来佛主保佑！阿门！");
		}
		
	}

}
