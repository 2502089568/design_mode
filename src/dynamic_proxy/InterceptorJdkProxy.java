package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler {

	private Object target = null;//目标对象
	
	public String interceptorClass = null;//拦截器全限定名
	
	public InterceptorJdkProxy(Object target, String interceptorClass) {
		this.target = target;
		this.interceptorClass = interceptorClass;
	}
	
	//建立真实对象与代理对象之间的关系，返回代理对象
	public Object bind() {
		//传入类加载器，生成动态代理对象下挂在哪些接口下，可使代理对象直接用接口声明
		//以及传入定义实现方法逻辑的代理类this表当前对象，必须实现InvocationHandler的invoke方法
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
	}
	
	//arg0：代理对象bind生成的对象
	//arg1：当前调度方法
	//arg2：调度方法的参数
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		if(interceptorClass == null) {//无拦截器直接反射原有方法
			return arg1.invoke(target, arg2);
		}
		Object result = null;
		//通过反射生成拦截器
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
		if(interceptor.before(arg0, target, arg1, arg2)) {//直接反射原有对象
			result = arg1.invoke(target, arg2);
		}else {//调用around方法
			interceptor.around(arg0, target, arg1, arg2);
		}
		//最后都会调用后置方法
		interceptor.after(arg0, target, arg1, arg2);
		return result;
	}

}
