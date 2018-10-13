package com.itheima.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlPath = "com/itheima/instance/static_factory/beans2.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("bean2"));
	}

}
