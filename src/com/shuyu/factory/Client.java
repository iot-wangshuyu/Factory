package com.shuyu.factory;

/**
 * @Title: Client.java 
 * @Package com.shuyu.factory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("开始");
		IFactory factory=new JeepFactory();
		ICar car=factory.CreateCar();
		car.GetCar();
	}

}
