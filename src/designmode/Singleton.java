package designmode;
/*һЩ����ֻ����һ��
 * ˽�й��췽���������ⲿֱ�Ӵ�������
 * *����ģʽ*�ڼ������ʱ��Ƚ�����������ʱ��ȡ����ȽϿ죬�̰߳�ȫ
 * *����ģʽ*�ڼ������ʱ��ȽϿ죬������ʱ��ȡ����Ƚ������̲߳���ȫ
 * */
public class Singleton {
	private Singleton() {}
	
/*  //*����ģʽ*����static�����౻���ص�ʱ��ʵ���ͻᱻ���أ�
	//������Ψһʵ��û private�Ļ��ⲿֱ��Singleton.instance���ɻ��	
	private static Singleton instance = new Singleton(); 
	
	public static Singleton getInstance() {
		return instance;
	}*/
	
/*	//*����ģʽ*(����ʵ����ʱ��new������get��new)
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();  
		}
		return instance;
	}*/
}
