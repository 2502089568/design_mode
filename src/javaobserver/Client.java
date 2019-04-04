package javaobserver;

public class Client {

	public static void main(String[] args) {
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		ConcreteObserver girl=new ConcreteObserver();
		girl.setObserverName("小黄女朋友");
		
		subject.addObserver(girl);
		
		subject.setContent("天气晴，气温28");

	}

}
