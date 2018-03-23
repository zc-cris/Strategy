package com.zc.cris.fourthteenth.memo;

/**
 * 专门用来记录游戏角色类的状态信息的备忘录类
 * 
 * @author chongqingwuyifan
 *
 */
public class Memo {

	private Integer memoBlood;
	private Integer memoAttackValue;
	private Integer memoDefenseValue;

	public Memo(Integer memoBlood, Integer memoAttackValue, Integer memoDefenseValue) {
		super();
		this.memoBlood = memoBlood;
		this.memoAttackValue = memoAttackValue;
		this.memoDefenseValue = memoDefenseValue;
	}

	public Integer getMemoBlood() {
		return memoBlood;
	}

	public void setMemoBlood(Integer memoBlood) {
		this.memoBlood = memoBlood;
	}

	public Integer getMemoAttackValue() {
		return memoAttackValue;
	}

	public void setMemoAttackValue(Integer memoAttackValue) {
		this.memoAttackValue = memoAttackValue;
	}

	public Integer getMemoDefenseValue() {
		return memoDefenseValue;
	}

	public void setMemoDefenseValue(Integer memoDefenseValue) {
		this.memoDefenseValue = memoDefenseValue;
	}

}
