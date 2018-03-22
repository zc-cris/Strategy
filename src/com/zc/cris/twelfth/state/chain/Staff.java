package com.zc.cris.twelfth.state.chain;

/**
 * 职工类，具有工作时间，工作进度以及状态类成员属性
 * 
 * @author chongqingwuyifan
 *
 */
public class Staff {

	private Integer workTime = 0;
	private boolean workProgress = false;
	private State state = new GreatState();
	
	/*
	 * 将职工当前状态判断交给了状态类，员工只需要负责工作即可
	 * 工作状态由状态类根据工作时长和工作进度来决定
	 */
	public void currentWorkState(State state) {
		this.setState(state);
		this.state.handle(this);
	}
	public void currentWorkState() {
		this.state.handle(this);
	}
	

	public Integer getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}

	public boolean isWorkProgress() {
		return workProgress;
	}

	public void setWorkProgress(boolean workProgress) {
		this.workProgress = workProgress;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
