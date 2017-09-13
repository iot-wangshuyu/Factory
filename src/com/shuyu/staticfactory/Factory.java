package com.shuyu.staticfactory;

/**
 * @Title: Factory.java 
 * @Package com.shuyu.staticfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0   
 */
public class Factory {
	
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
