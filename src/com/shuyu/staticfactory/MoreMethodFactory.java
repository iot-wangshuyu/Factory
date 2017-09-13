package com.shuyu.staticfactory;

/**
 * @Title: MoreMethodFactory.java
 * @Package com.shuyu.staticfactory
 * @Description: 多方法工厂（常用）
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0
 */
public class MoreMethodFactory {
	/*
	 * 使用方法二 三实现的工厂，都有一个缺点：不同的产品需要不同额外参数的时候 不支持。
	 * 
	 * 而且如果使用时传递的type、Class出错，将不能得到正确的对象，容错率不高。
	 * 
	 * 而多方法的工厂模式为不同产品，提供不同的生产方法，使用时 需要哪种产品就调用该种产品的方法，使用方便、容错率高。
	 */
	public static ICar getSport() {
		return new SportCar();
	}

	public static ICar getJeep() {
		return new JeepCar();
	}

	public static ICar getHatch() {
		return new HatchbackCar();
	}

}
