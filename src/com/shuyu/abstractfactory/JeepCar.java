package com.shuyu.abstractfactory;

/**
 * @Title: JeepCar.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class JeepCar extends AbstractCar {

	/* (非 Javadoc) 
	* <p>Title: getPrices</p> 
	* <p>Description: </p>  
	* @see com.shuyu.abstractfactory.AbstractCar#getPrices() 
	*/
	@Override
	public void getPrices() {
		System.out.println("买越野车的，价格100万");

	}

}
