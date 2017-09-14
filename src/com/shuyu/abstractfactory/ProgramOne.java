package com.shuyu.abstractfactory;

/**
 * @Title: ProgramOne.java
 * @Package com.shuyu.abstractfactory
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0
 */
public class ProgramOne extends AbstractFactory {
	// ��һ�����۷�������ԽҰ�����ͻ�Ϊ�ֻ�
	@Override
	public AbstractCar getCar() {

		return new JeepCar();
	}

	@Override
	public AbstractPhone createPhone() {

		return new HuaWeiPhone();
	}

}
