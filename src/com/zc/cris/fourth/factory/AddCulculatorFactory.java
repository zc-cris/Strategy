package com.zc.cris.fourth.factory;

/**
 * 专门用来生产加法类的加法工厂
 * @author chongqingwuyifan
 *
 */
public class AddCulculatorFactory implements ICulculatorFactory {

	@Override
	public Culculator createCulculator() {
		
		return new AddCulculator();
	}

}
