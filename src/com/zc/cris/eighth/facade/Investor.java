package com.zc.cris.eighth.facade;

/**
 * 投资人只需要知道如何买基金和卖基金即可，其他的股票什么的一概不知
 * 将不擅长的事情交给最擅长的人去做即可，最擅长的人只需要提供一个账号，投资人往里面投钱即可
 * @author chongqingwuyifan
 *
 */
public class Investor {
	
	private static Fund fund;
	
	public void buy() {
		fund = new FundA();
		fund.buy();
	}
	
	public void sale() {
		fund.sale();
	}
	
	public static void main(String[] args) {
		Investor investor = new Investor();
		investor.buy();
		investor.sale();
	}
}
