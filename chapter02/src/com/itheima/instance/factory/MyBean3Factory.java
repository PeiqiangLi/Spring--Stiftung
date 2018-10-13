package com.itheima.instance.factory;

public class MyBean3Factory {
	
	//构造器实例化MyBean3Factory
	public MyBean3Factory() {
		System.out.println("bean3工厂实例化中");
	}
	
	public Bean3 createBean() {
		return new Bean3();
	}

}
