package com.shuyu.abstractfactory;

/**
 * @Title: ProgramTwo.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月14日
 * @version V1.0   
 */
public class ProgramTwo extends AbstractFactory {

	/* (非 Javadoc) 
	* <p>Title: getCar</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.shuyu.abstractfactory.AbstractFactory#getCar() 
	*/
	@Override
	public AbstractCar getCar() {
		return new SportsCar();
	}

	/* (非 Javadoc) 
	* <p>Title: createPhone</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.shuyu.abstractfactory.AbstractFactory#createPhone() 
	*/
	@Override
	public AbstractPhone createPhone() {
		return new IPnone();
	}

}
