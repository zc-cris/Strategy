package com.zc.cris.ninth.builder;

/**
 * 建造者接口，定义通用的细节实现功能
 * @author chongqingwuyifan
 *
 */
public interface MaoCaiBuilder {

	public void addVegetables();

	public void addMeat();

	public void addPepper();
	
	public MaoCai returnMaoCai();

}
