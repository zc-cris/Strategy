package com.zc.cris.ninth.builder;

public class MaLaMaoCaiBuilder implements MaoCaiBuilder{

	private MaoCai maiCai = new MaoCai();
	
	@Override
	public void addVegetables() {
		this.maiCai.addFood("白菜");
	}

	@Override
	public void addMeat() {
		this.maiCai.addFood("牛肉");

	}

	@Override
	public void addPepper() {
		this.maiCai.addFood("很多辣椒");

		
	}

	@Override
	public MaoCai returnMaoCai() {
		return this.maiCai;
	}

}
