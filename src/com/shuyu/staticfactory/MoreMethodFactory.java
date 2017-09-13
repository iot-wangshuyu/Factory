package com.shuyu.staticfactory;

/**
 * @Title: MoreMethodFactory.java
 * @Package com.shuyu.staticfactory
 * @Description: �෽�����������ã�
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0
 */
public class MoreMethodFactory {
	/*
	 * ʹ�÷����� ��ʵ�ֵĹ���������һ��ȱ�㣺��ͬ�Ĳ�Ʒ��Ҫ��ͬ���������ʱ�� ��֧�֡�
	 * 
	 * �������ʹ��ʱ���ݵ�type��Class���������ܵõ���ȷ�Ķ����ݴ��ʲ��ߡ�
	 * 
	 * ���෽���Ĺ���ģʽΪ��ͬ��Ʒ���ṩ��ͬ������������ʹ��ʱ ��Ҫ���ֲ�Ʒ�͵��ø��ֲ�Ʒ�ķ�����ʹ�÷��㡢�ݴ��ʸߡ�
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
