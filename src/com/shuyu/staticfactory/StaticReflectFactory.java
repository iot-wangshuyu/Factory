package com.shuyu.staticfactory;

/**
 * @Title: StaticReflectFactory.java
 * @Package com.shuyu.staticfactory
 * @Description: 利用反射实现静态工厂
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月13日
 * @version V1.0
 */
public class StaticReflectFactory {
	/*
	 * 它也是一个具体的类，非接口
	 * 抽象类。但它的create()方法，是利用反射机制生成对象返回，好处是增加一种产品时，不需要修改工厂Factory的代码。缺点这种写法粗看牛逼，
	 * 细想之下，不谈reflection的效率还有以下问题：
	 * 
	 * 个人觉得不好，因为Class.forName(clz.getName()).newInstance()调用的是无参构造函数生成对象，它和new
	 * Object()是一样的性质，而工厂方法应该用于复杂对象的初始化 ，当需要调用有参的构造函数时便无能为力了，这样像为了工厂而工厂。
	 * 
	 * 不同的产品需要不同额外参数的时候 不支持。
	 */
	public static <T extends ICar> T createCars(Class<T> clz) {
		T result = null;
		try {
			result = (T) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
