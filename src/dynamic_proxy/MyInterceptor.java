package dynamic_proxy;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("���䷽��ǰ�߼�");
		return false;//�����䱻�����ԭ�ж���
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("ȡ���˱��������ķ���");

	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("���䷽�����߼�");

	}

}
