package com.shuyu.factory;

/**
 * @Title: Client.java
 * @Package com.shuyu.factory
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0
 */
public class Client {
	/*
	 * ��ͨ������򵥹���ģʽ������
	 * 
	 * ���Կ�������ͨ����ģʽ�ص㣺�������������Ĳ�ƷҪ���� ����ҲӦ����Ҫ����
	 * 
	 * ��������ʹһ����Ʒ���ʵ�����ӳٵ�����幤������.
	 * 
	 * ���������ĺô����Ǹ�ӵ���仯��������仯��ֻ��Ҫ��ɾ��Ӧ���࣬����Ҫ�޸����е��ࡣ
	 * 
	 * ���򵥹�����Ҫ�޸Ĺ������create()�������෽����̬����ģʽ��Ҫ����һ����̬������
	 * 
	 * ȱ�㣺
	 * 
	 * ������󹤳����ÿ������һ�������Ʒ�࣬ҲҪͬʱ����һ�����幤���࣬�����Ҹ����� �෽����̬������
	 */

	public static void main(String[] args) {

		System.out.println("��ʼ");
		IFactory factory = new JeepFactory();
		ICar car = factory.CreateCar();
		car.GetCar();
	}

}
