package com.shuyu.abstractfactory;

/**
 * @Title: IPnone.java 
 * @Package com.shuyu.abstractfactory 
 * @Description: TODO
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0   
 */
public class IPnone extends AbstractPhone {

	/* (非 Javadoc) 
	* <p>Title: getPhone</p> 
	* <p>Description: </p>  
	* @see com.shuyu.abstractfactory.AbstractPhone#getPhone() 
	*/
	@Override
	public void getPhone() {
		System.out.println("送苹果手机");

	}

}
