package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler {

	private Object target = null;//Ŀ�����
	
	public String interceptorClass = null;//������ȫ�޶���
	
	public InterceptorJdkProxy(Object target, String interceptorClass) {
		this.target = target;
		this.interceptorClass = interceptorClass;
	}
	
	//������ʵ������������֮��Ĺ�ϵ�����ش������
	public Object bind() {
		//����������������ɶ�̬��������¹�����Щ�ӿ��£���ʹ�������ֱ���ýӿ�����
		//�Լ����붨��ʵ�ַ����߼��Ĵ�����this��ǰ���󣬱���ʵ��InvocationHandler��invoke����
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InterceptorJdkProxy(target, interceptorClass));
	}
	
	//arg0���������bind���ɵĶ���
	//arg1����ǰ���ȷ���
	//arg2�����ȷ����Ĳ���
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		if(interceptorClass == null) {//��������ֱ�ӷ���ԭ�з���
			return arg1.invoke(target, arg2);
		}
		Object result = null;
		//ͨ����������������
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
		if(interceptor.before(arg0, target, arg1, arg2)) {//ֱ�ӷ���ԭ�ж���
			result = arg1.invoke(target, arg2);
		}else {//����around����
			interceptor.around(arg0, target, arg1, arg2);
		}
		//��󶼻���ú��÷���
		interceptor.after(arg0, target, arg1, arg2);
		return result;
	}

}
