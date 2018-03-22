package com.zc.cris.twelfth.state.chain;

/**
 * 状态类，根据职工的时间和工作进度判断当前职工的状态
 * @author chongqingwuyifan
 *
 */
public interface State {
	
	public void handle(Staff staff);

}
