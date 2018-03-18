package com.zc.cris.ninth.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 产品，提供组成部分设计图
 * @author chongqingwuyifan
 *
 */
public class MaoCai {

	private List<String> food = new ArrayList<>();
	
	public void addFood(String str) {
		food.add(str);
	}
	
	public void showFoods() {
		System.out.println(food);
	}
	
}
