package com.shuyu.factory;

/**
 * @Title: SportFactory.java 
 * @Package com.shuyu.factory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class SportFactory implements IFactory {

	/* (非 Javadoc) 
	* <p>Title: CreateCar</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.shuyu.factory.IFactory#CreateCar() 
	*/
	@Override
	public ICar CreateCar() {
		return new SportCar();
	}

}
