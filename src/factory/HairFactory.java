package factory;
//���͹���
//���������ɷ��ͣ�ʹ���ǲ����ڿͻ�����ʾ���÷��͵�ʱ��ľ�����ľͿ�����
public class HairFactory {
	
	//�����������ɷ��ͣ���������ÿ�μ��·��Ͷ�Ҫ��else if��
	public Hair getHair(String key) {
		if("left".equals(key)) {
			return new LeftHair();
		}else if("right".equals(key)) {
			return new RightHair();
		}else {
			return null;
		}
		
	}
	
	//�������������������
	//���䣺����������ƴ�������ʵ��
	//���ӷ��͵Ļ���ֱ�Ӽӷ��͵��������
	public Hair getHairByClass(String className) {
		try {
			Hair hair =(Hair) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����
		return null;
	}
}
