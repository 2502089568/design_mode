package Observer;
/*目标对象，知道观察它的对象，并提供注册接口和删除观察
 * */
//当不同观察者有不同要求时（女：只要提醒下雨，母：下雨和下雪）
import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	//用来保存注册观察者对象（订阅天气的人）
	protected List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/*//经典的可以直接在这实现
	//通知所有注册的观察者，只有子类可调用
	protected void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(this);
		}
	}*/
	
	//不同观察者有不同的需求时用抽象
	protected abstract void notifyObservers();
}
