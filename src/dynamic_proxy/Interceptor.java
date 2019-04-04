package dynamic_proxy;

import java.lang.reflect.Method;

public interface Interceptor {
	//����ʵ����ǰ���ã�����true������ʵ���󣬷������around
	public boolean before(Object proxy, Object target, Method method, Object[] args);
	//before��������false����around
	public void around(Object proxy, Object target, Method method, Object[] args);
	//������ʵ�����around����ִ�к����
	public void after(Object proxy, Object target, Method method, Object[] args);
}
