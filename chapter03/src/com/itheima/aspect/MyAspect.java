package com.itheima.aspect;
//切面类：可以存在多个通知Advice（即执行方法）
public class MyAspect {
	public void check_Permissions() {
		// TODO Auto-generated method stub
		System.out.println("模拟检查权限...");
	}
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("模拟记录日志...");
	}
}
