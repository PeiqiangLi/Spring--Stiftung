package com.itheima.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlPath = "com/itheima/instance/constructor/beans1.xml";
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		Bean1 bean = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean);
	}

}
