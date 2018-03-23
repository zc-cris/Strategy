package com.zc.cris.fourthteenth.memo;

/**
 * 游戏角色类
 * 
 * @author chongqingwuyifan
 *
 */
public class GameRole {

	private Integer blood;
	private Integer attackValue;
	private Integer defenseValue;

	// 初始化属性值
	public void init() {
		this.blood = 100;
		this.attackValue = 100;
		this.defenseValue = 100;
	}

	// 备份角色状态
	public Memo memo() {
		return new Memo(blood, attackValue, defenseValue);
	}

	// 从备份状态恢复
	public void recovery(Memo memo) {
		this.blood = memo.getMemoBlood();
		this.attackValue = memo.getMemoAttackValue();
		this.defenseValue = memo.getMemoDefenseValue();
	}

	// 打 boss 失败结束的方法
	public void end() {
		this.blood = 0;
		this.attackValue = 0;
		this.defenseValue = 0;
	}

	// 展示当前状态
	public void showState() {
		System.out.println("当前血量：" + this.blood + "当前攻击力：" + this.attackValue + "当前防御力：" + this.defenseValue);
	}

	public Integer getBlood() {
		return blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	public Integer getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(Integer attackValue) {
		this.attackValue = attackValue;
	}

	public Integer getDefenseValue() {
		return defenseValue;
	}

	public void setDefenseValue(Integer defenseValue) {
		this.defenseValue = defenseValue;
	}

}
