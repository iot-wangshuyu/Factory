package com.shuyu.staticfactory;

/**
 * @Title: Factory.java 
 * @Package com.shuyu.staticfactory 
 * @Description: �򵥹���ģʽ
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0   
 */
public class Factory {
	/*
	 * �򵥹���ģʽ�����ڴ�����ģʽ���ֽ�����̬����������Static Factory Method��ģʽ����������23��GOF���ģʽ֮һ��
	 * �򵥹���ģʽ����һ���������������������һ�ֲ�Ʒ���ʵ�����򵥹���ģʽ�ǹ���ģʽ���������ʵ�õ�ģʽ���������Ϊ �ǲ�ͬ����ģʽ��һ������ʵ�֡�
	 * �򵥹������ŵ�/ȱ�㣺
	 * �ŵ㣺�򵥹���ģʽ�ܹ���������������Ϣ����������Ӧ�ô����ĸ�������Ķ�����ȷ�����˸��Ե�ְ���Ȩ�������������������ϵ�ṹ���Ż���
	 * ȱ�㣺�����Թ����༯��������ʵ���Ĵ����߼�������Υ��GRASPR�ĸ��ھ۵����η���ԭ��
	 * 
	 */
	
	/** 
	* @Title: getCar 
	* @Description: TODO(������һ�仰�����������������) 
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
			throw new Exception("����һƥҰ��,���ҵļ���û�в�ԭ. ���߰ɣ�");
		}
	}

}
