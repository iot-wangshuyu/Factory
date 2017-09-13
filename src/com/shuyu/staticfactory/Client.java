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
	/*
	 * 简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一。
	 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为 是不同工厂模式的一个特殊实现。
	 * 简单工厂的优点/缺点：
	 * 优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。明确区分了各自的职责和权力，有利于整个软件体系结构的优化。
	 * 缺点：很明显工厂类集中了所有实例的创建逻辑，容易违反GRASPR的高内聚的责任分配原则
	 * 
	 */
	public static void main(String[] args) {
		Factory factory = new Factory();
		try {
			ICar car = factory.getCar(4);
			car.GetCar();
			System.out.println("完成生产");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
