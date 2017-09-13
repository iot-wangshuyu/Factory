package com.shuyu.factory;

/**
 * @Title: HatchbackFactory.java 
 * @Package com.shuyu.factory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��13��
 * @version V1.0   
 */
public class HatchbackFactory implements IFactory {

	/* (�� Javadoc) 
	* <p>Title: CreateCar</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.shuyu.factory.IFactory#CreateCar() 
	*/
	@Override
	public ICar CreateCar() {
		return new HatchbackCar();
	}

}
