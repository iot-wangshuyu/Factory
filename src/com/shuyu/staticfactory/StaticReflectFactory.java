package com.shuyu.staticfactory;

/**
 * @Title: StaticReflectFactory.java
 * @Package com.shuyu.staticfactory
 * @Description: ���÷���ʵ�־�̬����
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0
 */
public class StaticReflectFactory {
	/*
	 * ��Ҳ��һ��������࣬�ǽӿ�
	 * �����ࡣ������create()�����������÷���������ɶ��󷵻أ��ô�������һ�ֲ�Ʒʱ������Ҫ�޸Ĺ���Factory�Ĵ��롣ȱ������д���ֿ�ţ�ƣ�
	 * ϸ��֮�£���̸reflection��Ч�ʻ����������⣺
	 * 
	 * ���˾��ò��ã���ΪClass.forName(clz.getName()).newInstance()���õ����޲ι��캯�����ɶ�������new
	 * Object()��һ�������ʣ�����������Ӧ�����ڸ��Ӷ���ĳ�ʼ�� ������Ҫ�����вεĹ��캯��ʱ������Ϊ���ˣ�������Ϊ�˹�����������
	 * 
	 * ��ͬ�Ĳ�Ʒ��Ҫ��ͬ���������ʱ�� ��֧�֡�
	 */
	public static <T extends ICar> T createCars(Class<T> clz) {
		T result = null;
		try {
			result = (T) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
