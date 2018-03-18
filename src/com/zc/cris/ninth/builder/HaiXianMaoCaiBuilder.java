package com.zc.cris.ninth.builder;

/**
 * 具体的建造者，提供细节实现
 * @author chongqingwuyifan
 *
 */
public class HaiXianMaoCaiBuilder implements MaoCaiBuilder{

	private MaoCai maiCai = new MaoCai();
	
	@Override
	public void addVegetables() {
		this.maiCai.addFood("海带");
	}

	@Override
	public void addMeat() {
		this.maiCai.addFood("生蚝");
	}

	@Override
	public void addPepper() {
		this.maiCai.addFood("没有辣椒");
	}

	@Override
	public MaoCai returnMaoCai() {
		return this.maiCai;
	}

}
