package com.shuyu.abstractfactory;

/**
 * @Title: Client.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017Äê9ÔÂ14ÈÕ
 * @version V1.0   
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory= new ProgramOne();
		abstractFactory.getCar().getPrices();
		abstractFactory.createPhone().getPhone();
		
		System.out.println();
		
		AbstractFactory abstractFactory2= new ProgramTwo();
		abstractFactory2.getCar().getPrices();
		abstractFactory2.createPhone().getPhone();
	}

}
