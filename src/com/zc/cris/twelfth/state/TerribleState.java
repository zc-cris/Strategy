package com.zc.cris.twelfth.state;

public class TerribleState implements State {

	@Override
	public void handle(Staff staff) {
		if(staff.isWorkProgress() == true) {
			System.out.println("终于熬夜做完了，这样下去真的要猝死了！my gad！");
		}else {
			System.out.println("我的天，这个任务太难了，不行，还是要睡觉，要不然就挂了。。。");
		}
	}
}
