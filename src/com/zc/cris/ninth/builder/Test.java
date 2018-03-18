package com.zc.cris.ninth.builder;

public class Test {

	public static void main(String[] args) {

		Director director = new Director();
		// 为调用者提供具体的流程实现类，由调用者按照一定的顺序进行生产
		MaoCaiBuilder maoCaiBuilder = new HaiXianMaoCaiBuilder();
		director.Construct(maoCaiBuilder);
		// 返回生产好的产品
		MaoCai maocai = maoCaiBuilder.returnMaoCai();
		maocai.showFoods();

		MaoCaiBuilder maoCaiBuilder2 = new MaLaMaoCaiBuilder();
		director.Construct(maoCaiBuilder2);
		maocai = maoCaiBuilder2.returnMaoCai();
		maocai.showFoods();

	}

}
