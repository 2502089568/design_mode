package Observer;

public class Client {

	public static void main(String[] args) {
		//1.����Ŀ��
		ConcreteWeatherSubject weather =new ConcreteWeatherSubject();
		
		//2.�����۲���
		ConcreteObserver observerGirl =new ConcreteObserver();
		observerGirl.setObserverName("С��");
		observerGirl.setRemindThing("�ǵô�ɡ");
		
		ConcreteObserver observerMum =new ConcreteObserver();
		observerMum.setObserverName("����");
		observerMum.setRemindThing("��Ҫ����");
		
		//3.ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		
		//4.Ŀ�귢������
		weather.setWeatherContent("��ѩ");
	}

}
