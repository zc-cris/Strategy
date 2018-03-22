package com.zc.cris.twelfth.state;

// 职工状态变换，其中前面状态一般都是固定的，最后下班时的状态各不一样，根据职工的工作时间
// 和任务进度调用对应的状态类显示当前员工的状态
public class TestState {

	public static void main(String[] args) {
		
		Staff staff = new Staff();
		staff.currentWorkState();
		
		staff.setWorkTime(3);
		// 必须再调用一次方法，执行 State 类的判断才可以继续进行下去
		staff.currentWorkState();
//		
//		staff.setWorkTime(7);
//		staff.setWorkProgress(true);
//		staff.currentWorkState();
		
//		staff.setWorkTime(9);
//		staff.setWorkProgress(true);
//		staff.currentWorkState();
	
		staff.setWorkTime(11);
		staff.setWorkProgress(true);
		staff.currentWorkState();
		
	}
}
