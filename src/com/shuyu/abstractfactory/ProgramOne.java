package com.shuyu.abstractfactory;

/**
 * @Title: ProgramOne.java
 * @Package com.shuyu.abstractfactory
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0
 */
public class ProgramOne extends AbstractFactory {
	// 第一种销售方案：买越野车，送华为手机
	@Override
	public AbstractCar getCar() {

		return new JeepCar();
	}

	@Override
	public AbstractPhone createPhone() {

		return new HuaWeiPhone();
	}

}
