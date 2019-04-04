package Observer;
/*Ŀ�����֪���۲����Ķ��󣬲��ṩע��ӿں�ɾ���۲�
 * */
//����ͬ�۲����в�ͬҪ��ʱ��Ů��ֻҪ�������꣬ĸ���������ѩ��
import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	//��������ע��۲��߶��󣨶����������ˣ�
	protected List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/*//����Ŀ���ֱ������ʵ��
	//֪ͨ����ע��Ĺ۲��ߣ�ֻ������ɵ���
	protected void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(this);
		}
	}*/
	
	//��ͬ�۲����в�ͬ������ʱ�ó���
	protected abstract void notifyObservers();
}
