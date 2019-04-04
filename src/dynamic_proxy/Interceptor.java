package dynamic_proxy;

import java.lang.reflect.Method;

public interface Interceptor {
	//在真实调用前调用，返回true则反射真实对象，否则调用around
	public boolean before(Object proxy, Object target, Method method, Object[] args);
	//before方法返回false调用around
	public void around(Object proxy, Object target, Method method, Object[] args);
	//反射真实对象或around方法执行后调用
	public void after(Object proxy, Object target, Method method, Object[] args);
}
