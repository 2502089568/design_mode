package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyExample implements InvocationHandler {

	private Object target = null;//目标对象
	
	//建立真实对象与代理对象之间的关系，返回代理对象
	public Object bind(Object target) {
		this.target = target;
		//传入类加载器，生成动态代理对象下挂在哪些接口下，可使代理对象直接用接口声明
		//以及传入定义实现方法逻辑的代理类this表当前对象，必须实现InvocationHandler的invoke方法
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	//arg0：代理对象bind生成的对象
	//arg1：当前调度方法
	//arg2：调度方法的参数
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("进入代理逻辑方法");
		System.out.println("在调度真实对象之前的服务");
		//传入对象和方法要的参数，相当于调用sayHelloWorld方法
		Object object = arg1.invoke(this.target, arg2);
		System.out.println("在调度真实对象后的服务");
		return object;
	}

}
