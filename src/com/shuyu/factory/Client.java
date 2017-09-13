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
	/*
	 * 普通工厂与简单工厂模式的区别：
	 * 
	 * 可以看出，普通工厂模式特点：不仅仅做出来的产品要抽象， 工厂也应该需要抽象。
	 * 
	 * 工厂方法使一个产品类的实例化延迟到其具体工厂子类.
	 * 
	 * 工厂方法的好处就是更拥抱变化。当需求变化，只需要增删相应的类，不需要修改已有的类。
	 * 
	 * 而简单工厂需要修改工厂类的create()方法，多方法静态工厂模式需要增加一个静态方法。
	 * 
	 * 缺点：
	 * 
	 * 引入抽象工厂层后，每次新增一个具体产品类，也要同时新增一个具体工厂类，所以我更青睐 多方法静态工厂。
	 */

	public static void main(String[] args) {

		System.out.println("开始");
		IFactory factory = new JeepFactory();
		ICar car = factory.CreateCar();
		car.GetCar();
	}

}
