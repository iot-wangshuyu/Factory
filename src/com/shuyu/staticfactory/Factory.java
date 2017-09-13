package com.shuyu.staticfactory;

/**
 * @Title: Factory.java 
 * @Package com.shuyu.staticfactory 
 * @Description: 简单工厂模式
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class Factory {
	/*
	 * 简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一。
	 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为 是不同工厂模式的一个特殊实现。
	 * 简单工厂的优点/缺点：
	 * 优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。明确区分了各自的职责和权力，有利于整个软件体系结构的优化。
	 * 缺点：很明显工厂类集中了所有实例的创建逻辑，容易违反GRASPR的高内聚的责任分配原则
	 * 
	 */
	
	/** 
	* @Title: getCar 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param type
	* @throws Exception
	* @return ICar
	*/
	public ICar getCar(int type) throws Exception{
		switch (type) {
		case 1:
        return new SportCar();
		case 2:
	        return new JeepCar();
		case 3:
	        return new HatchbackCar();
		default:
			throw new Exception("爱上一匹野马,可我的家里没有草原. 你走吧！");
		}
	}

}
