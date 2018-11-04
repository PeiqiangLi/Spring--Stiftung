package com.itheima.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.jdk.UserDao;

public class ProxyFactoryBeanTest {
	
	public static void main(String args[]) {
		
		String xmlPath = "com/itheima/factorybean/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		//执行方法
		userDao.addUser();
		userDao.deleteUser();
		
	}

}
