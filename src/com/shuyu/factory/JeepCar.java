package com.shuyu.factory;

/**
 * @Title: JeepCar.java 
 * @Package com.shuyu.factory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class JeepCar implements ICar {

	/* (非 Javadoc) 
	* <p>Title: GetCar</p> 
	* <p>Description: </p>  
	* @see com.shuyu.factory.ICar#GetCar() 
	*/
	@Override
	public void GetCar() {
		System.out.println("生产越野车");

	}

}
