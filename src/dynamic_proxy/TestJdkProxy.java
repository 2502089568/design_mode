package dynamic_proxy;

public class TestJdkProxy {

	public static void main(String[] args) throws Exception{
		JDKProxyExample jdk = new JDKProxyExample();
		HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
		proxy.sayHelloWorld();
		
		System.out.println("-----------------------");
		
		//System.out.println(Class.forName("dynamic_proxy.MyInterceptor").newInstance());
		InterceptorJdkProxy interceptorJdkProxy = new InterceptorJdkProxy(new HelloWorldImpl(),
				"dynamic_proxy.MyInterceptor");
		HelloWorld Iproxy = (HelloWorld)interceptorJdkProxy.bind();
		Iproxy.sayHelloWorld();
	}

}
