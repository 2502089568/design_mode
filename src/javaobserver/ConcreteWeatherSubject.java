package javaobserver;
//�����ã�����ʹ��PropertyChangeListener��
//@�����Ѿ������Ϊ�ʵ����ĵ�����̽�������������ӵ���������
import java.util.Observable;

@SuppressWarnings("deprecation")
public class ConcreteWeatherSubject extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//֪ͨǰ��仰������
		this.setChanged();
		//����֪ͨ
		this.notifyObservers(content);
	}
	
}
