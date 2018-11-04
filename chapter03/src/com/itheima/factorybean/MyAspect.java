package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		check_Permission();
		Object obj = mi.proceed();
		log();
		return obj;
	}
	
	private void check_Permission() {
		// TODO Auto-generated method stub
		System.out.println("模拟检查权限。。。");
	}

	public void log() {
		System.out.println("模拟记录日志。。。");
	}

}
