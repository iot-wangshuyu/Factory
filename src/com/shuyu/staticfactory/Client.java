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
	/*
	 * �򵥹���ģʽ�����ڴ�����ģʽ���ֽ�����̬����������Static Factory Method��ģʽ����������23��GOF���ģʽ֮һ��
	 * �򵥹���ģʽ����һ���������������������һ�ֲ�Ʒ���ʵ�����򵥹���ģʽ�ǹ���ģʽ���������ʵ�õ�ģʽ���������Ϊ �ǲ�ͬ����ģʽ��һ������ʵ�֡�
	 * �򵥹������ŵ�/ȱ�㣺
	 * �ŵ㣺�򵥹���ģʽ�ܹ���������������Ϣ����������Ӧ�ô����ĸ�������Ķ�����ȷ�����˸��Ե�ְ���Ȩ�������������������ϵ�ṹ���Ż���
	 * ȱ�㣺�����Թ����༯��������ʵ���Ĵ����߼�������Υ��GRASPR�ĸ��ھ۵����η���ԭ��
	 * 
	 */
	public static void main(String[] args) {
		Factory factory = new Factory();
		try {
			ICar car = factory.getCar(4);
			car.GetCar();
			System.out.println("�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
