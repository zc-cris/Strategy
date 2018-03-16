package com.zc.cris.fourth.factory;

/**
 * 专门负责生产减法类的减法工厂
 * @author chongqingwuyifan
 *
 */
public class SubCulculatorFactory implements ICulculatorFactory {

	@Override
	public Culculator createCulculator() {
		return new SubCulculator();
	}

}
