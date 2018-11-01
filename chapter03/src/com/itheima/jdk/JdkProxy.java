package com.itheima.jdk;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.itheima.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;

/**
 * JDK代理类
 * 从代理对象中获得目标对象userDao增强后的对象
 */
public class JdkProxy implements InvocationHandler {
	
	private UserDao userDao;
	
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		//类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//被代理对象实现的所有接口
		Class[] clazz = userDao.getClass().getInterfaces();
		//使用代理类，进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, clazz, this);//this指代理类本身
	}

	/**
	 * 所有动态代理类的方法调用，都会交由invoke()方法去处理
	 * proxy 指被代理后的对象
	 * method 指将要被执行的方法信息（反射）
	 * args 指执行方法时需要的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//声明切面
		MyAspect myAspect = new MyAspect();
		//前增强
		myAspect.check_Permissions();
		//在目标类上调用方法，并传入参数
		Object object = method.invoke(userDao, args);
		//后增强
		myAspect.log();
		return object;
	}
	

}
