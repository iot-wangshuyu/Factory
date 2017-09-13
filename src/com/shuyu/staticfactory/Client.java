package com.shuyu.staticfactory;

/**
 * @Title: Client.java
 * @Package com.shuyu.staticfactory
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0
 */
public class Client {
	
	public static void main(String[] args) {
		
		//简单静态工厂测试
		Factory factory = new Factory();
		try {
			ICar car = factory.getCar(4);
			car.GetCar();
			System.out.println("完成生产");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		//利用反射实现静态工厂
		JeepCar createCars = StaticReflectFactory.createCars(JeepCar.class);
		createCars.GetCar();
		
		//多方法静态工厂
		ICar sport = MoreMethodFactory.getSport();
		sport.GetCar();
	}

}
