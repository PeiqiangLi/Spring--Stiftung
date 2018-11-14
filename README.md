# Spring--Stiftung
Spring 基础
## chapter01
Spring控制反转和依赖注入的实例
## chapter02
Spring Bean的实例化
1.构造器实例化
2.静态工厂方法实例化
3.实例工厂方法实例化
## chapter03
Spring AOP的实现\<br>
1.代理方式的分析
* Spring默认使用JDK动态代理实现AOP，（使用动态代理的对象必须实现一个或多个接口）
  * 代理的对象是接口的实现类
* CGLIB代理，可以对没有实现接口的类进行代理
  * 对指定目标生成一个子类，并对子类进行增强
2.基于代理的AOP实现
* 使用ProxyFactoryBean创建AOP代理
