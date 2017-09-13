package com.shuyu.factory;

/**
 * @Title: SportCar.java 
 * @Package com.shuyu.factory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class SportCar implements ICar {

	/* (非 Javadoc) 
	* <p>Title: GetCar</p> 
	* <p>Description: </p>  
	* @see com.shuyu.factory.ICar#GetCar() 
	*/
	@Override
	public void GetCar() {
		System.out.println("生产跑车");

	}

}
