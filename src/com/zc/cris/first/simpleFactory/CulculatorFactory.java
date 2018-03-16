package com.zc.cris.first.simpleFactory;

/**
 * 生产不同计算功能类的简单工厂
 * @author chongqingwuyifan
 *
 */
public class CulculatorFactory {
	
	private Culculator culculator;
	
	public Culculator createCulculator(String message) {
		switch (message) {
		case "减法":
			culculator = new SubCulculator();
			break;

		case "加法":
			culculator = new AddCulculator();
			
		default:
			break;
		}
		return this.culculator;
	}
}
