package javaobserver;

public class Client {

	public static void main(String[] args) {
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		ConcreteObserver girl=new ConcreteObserver();
		girl.setObserverName("С��Ů����");
		
		subject.addObserver(girl);
		
		subject.setContent("�����磬����28");

	}

}
