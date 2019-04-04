package Observer;
/*观察者接口，定义一个更新的接口给那些在目标发生改变时被通知的对象
 * 拉模型：（例）将目标对象直接传过来，观察者自己通过get获得要的数据
 * 推模型：直接将数据传过来
 * */
public interface Observer {

	//更新接口（拉模型）
	public void update(WeatherSubject weatherSubject);
	//推模型
	//public void update(String Content);

	public void setObserverName(String observerName);
	
	public String getObserverName();
}
