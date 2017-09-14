package com.shuyu.abstractfactory;

/**
 * @Title: Client.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��14��
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
