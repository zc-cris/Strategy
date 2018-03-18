package com.zc.cris.ninth.builder;

/**
 * 调用者，负责流程控制
 * 
 * @author chongqingwuyifan
 *
 */
public class Director {

	public void Construct(MaoCaiBuilder maoCaiBuilder) {
		maoCaiBuilder.addMeat();
		maoCaiBuilder.addVegetables();
		maoCaiBuilder.addPepper();
	}

}
