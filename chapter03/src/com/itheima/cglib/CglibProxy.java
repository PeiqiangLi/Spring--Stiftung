package com.itheima.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.itheima.aspect.MyAspect;

/**
 * CGLIB代理
 * 通过对指定目标类生成一个子类，并对子类进行增强
 * 如果被代理的对象没有实现接口，可以使用这种代理方式
 */
public class CglibProxy implements MethodInterceptor {
	
	public Object createProxy(Object target) {
		//创建一个动态对象
		Enhancer enhancer = new Enhancer();
		//确定需要增强的类，设置其父类
		enhancer.setSuperclass(target.getClass());
		//添加回调函数
		enhancer.setCallback(this);//this指代理类本身
		//返回创建的代理类
		return enhancer.create();
	}

	/**
	 * proxy CGlib 根据指定父类生成的代理对象
	 * method 拦截的方法
	 * args 拦截方法的参数数组
	 * methodProxy 方法的代理对象，用于执行父类的方法
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		//创建切面类对象
		MyAspect myAspect = new MyAspect();
		//前增强
		myAspect.check_Permissions();
		//目标方法执行
		Object object = methodProxy.invokeSuper(proxy, args);
		//后增强
		myAspect.log();
		return object;
	}

}
