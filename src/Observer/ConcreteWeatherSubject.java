package Observer;
/*�����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * */

public class ConcreteWeatherSubject extends WeatherSubject {
	private String weatherContent;//subjectState

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

	//ʵ������Դ��۲���
	@Override
	protected void notifyObservers() {
		for(Observer observer:observers) {
			if("����".equals(this.getWeatherContent())) {
				observer.update(this);
			}
			if ("��ѩ".equals(this.getWeatherContent())) {
				if ("����".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
		}
	}

	
}
