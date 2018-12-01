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
Spring AOP的实现<br/>

1.代理方式的分析<br/>
* Spring默认使用JDK动态代理实现AOP，（使用动态代理的对象必须实现一个或多个接口）
  * 代理的对象是接口的实现类
* CGLIB代理，可以对没有实现接口的类进行代理
  * 对指定目标生成一个子类，并对子类进行增强<br/>

2.基于代理的AOP实现<br/>
* 使用ProxyFactoryBean创建AOP代理

### AspectJ开发
例子中使用了JoinPoint接口及其子接口ProceedingJoinPoint作为参数来获得目标对象的类名、目标方法名和目标方法参数等。<br/>
使用@Aspect注解定义了切面类，由于该类在Spring中是作为组件使用的，所以还需要添加@Component注解才能生效。<br/>
使用@Poincut注解来配置切入点表达式，并通过定义返回值为void、方法体为空的方法来命名切入点。
