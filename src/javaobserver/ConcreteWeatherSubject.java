package javaobserver;
//已弃用，可以使用PropertyChangeListener。
//@弃用已经被标记为适当的文档，以探索其他答案中链接的其他包。
import java.util.Observable;

@SuppressWarnings("deprecation")
public class ConcreteWeatherSubject extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//通知前这句话不可少
		this.setChanged();
		//主动通知
		this.notifyObservers(content);
	}
	
}
