package javaobserver;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class ConcreteObserver implements Observer {

	//�۲������ƶ���
	private String observerName;
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(observerName+":"+arg1);
	}
}
