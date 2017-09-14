package com.shuyu.abstractfactory;

/**
 * @Title: ProgramTwo.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017��9��14��
 * @version V1.0   
 */
public class ProgramTwo extends AbstractFactory {

	/* (�� Javadoc) 
	* <p>Title: getCar</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.shuyu.abstractfactory.AbstractFactory#getCar() 
	*/
	@Override
	public AbstractCar getCar() {
		return new SportsCar();
	}

	/* (�� Javadoc) 
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
