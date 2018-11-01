package com.itheima.jdk;

public class JdkTest {
	
	public static void main(String[] args) {
		//创建代理对象
		JdkProxy jdkProxy = new JdkProxy();
		//创建目标对象
		UserDao userDao = new UserDaoImpl();
		//从代理对象中获取增强后的目标对象(就是代理后的对象)
		UserDao userDao2 = (UserDao) jdkProxy.createProxy(userDao);
		//执行方法
		userDao2.addUser();
		userDao2.deleteUser();
	}

}
