package Observer;
/*具体的目标对象，负责把有关状态存入到相应的观察者对象中
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

	//实现区别对待观察者
	@Override
	protected void notifyObservers() {
		for(Observer observer:observers) {
			if("下雨".equals(this.getWeatherContent())) {
				observer.update(this);
			}
			if ("下雪".equals(this.getWeatherContent())) {
				if ("老妈".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
		}
	}

	
}
