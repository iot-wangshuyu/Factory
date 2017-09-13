package com.shuyu.staticfactory;

/**
 * @Title: Client.java
 * @Package com.shuyu.staticfactory
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0
 */
public class Client {
	
	public static void main(String[] args) {
		
		//�򵥾�̬��������
		Factory factory = new Factory();
		try {
			ICar car = factory.getCar(4);
			car.GetCar();
			System.out.println("�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		//���÷���ʵ�־�̬����
		JeepCar createCars = StaticReflectFactory.createCars(JeepCar.class);
		createCars.GetCar();
		
		//�෽����̬����
		ICar sport = MoreMethodFactory.getSport();
		sport.GetCar();
	}

}
