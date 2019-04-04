package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyExample implements InvocationHandler {

	private Object target = null;//Ŀ�����
	
	//������ʵ������������֮��Ĺ�ϵ�����ش������
	public Object bind(Object target) {
		this.target = target;
		//����������������ɶ�̬��������¹�����Щ�ӿ��£���ʹ�������ֱ���ýӿ�����
		//�Լ����붨��ʵ�ַ����߼��Ĵ�����this��ǰ���󣬱���ʵ��InvocationHandler��invoke����
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	//arg0���������bind���ɵĶ���
	//arg1����ǰ���ȷ���
	//arg2�����ȷ����Ĳ���
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("��������߼�����");
		System.out.println("�ڵ�����ʵ����֮ǰ�ķ���");
		//�������ͷ���Ҫ�Ĳ������൱�ڵ���sayHelloWorld����
		Object object = arg1.invoke(this.target, arg2);
		System.out.println("�ڵ�����ʵ�����ķ���");
		return object;
	}

}
