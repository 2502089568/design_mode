package Observer;
/*�۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı�ʱ��֪ͨ�Ķ���
 * ��ģ�ͣ���������Ŀ�����ֱ�Ӵ��������۲����Լ�ͨ��get���Ҫ������
 * ��ģ�ͣ�ֱ�ӽ����ݴ�����
 * */
public interface Observer {

	//���½ӿڣ���ģ�ͣ�
	public void update(WeatherSubject weatherSubject);
	//��ģ��
	//public void update(String Content);

	public void setObserverName(String observerName);
	
	public String getObserverName();
}
