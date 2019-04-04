package Observer;

public class Client {

	public static void main(String[] args) {
		//1.创建目标
		ConcreteWeatherSubject weather =new ConcreteWeatherSubject();
		
		//2.创建观察者
		ConcreteObserver observerGirl =new ConcreteObserver();
		observerGirl.setObserverName("小黄");
		observerGirl.setRemindThing("记得带伞");
		
		ConcreteObserver observerMum =new ConcreteObserver();
		observerMum.setObserverName("老妈");
		observerMum.setRemindThing("不要出门");
		
		//3.注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		
		//4.目标发布天气
		weather.setWeatherContent("下雪");
	}

}
