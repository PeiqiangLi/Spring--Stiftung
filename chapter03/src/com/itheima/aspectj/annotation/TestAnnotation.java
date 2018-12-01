package com.itheima.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.jdk.UserDao;

public class TestAnnotation {
	
	public static void main(String args[]) {
		
		String xmlPath = "com/itheima/aspectj/annotation/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
		
	}

}
