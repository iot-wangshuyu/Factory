package com.shuyu.staticfactory;

/**
 * @Title: Factory.java 
 * @Package com.shuyu.staticfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class Factory {
	
	/** 
	* @Title: getCar 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
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
			throw new Exception("爱上一匹野马,可我的家里没有草原. 你走吧！");
		}
	}

}
