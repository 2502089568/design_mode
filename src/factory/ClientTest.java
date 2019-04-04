package factory;
/*����Ϊ��̬����ģʽ
 * ��ŮΪ���󹤳�ģʽ
 * ���������ж�����Ƶ��࣬����Ҫʵ�����������������
 * ֮��ѹ������඼�ŵ�һ���ļ��������
 * */
public class ClientTest {

	public static void main(String[] args) {
		//��ʽ���ɷ��ͣ�������ÿ�����ɶ�Ҫ�ڿͻ��˵��ã��Ҳ��ù���
		//Hair left = new LeftHair();
		//left.draw();
		
		//����ģʽʵ��1
		HairFactory factory =new HairFactory();
		//Hair left = factory.getHair("left");
		//left.draw();
		//����ģʽʵ��2(�÷����ҵ�������ʹ����ÿ�μ����඼Ҫ�ӵ�����������)
		//Hair left = factory.getHairByClass("factory.LeftHair");//����+����
		Hair left = factory.getHairByClass(InHair.class.getName());//������������ֱ�ӵõ����·��
		left.draw();
		
		//���󹤳�
		PersonFactory factory2 = new MCFctory();
		Girl girl=factory2.getGirl();
		girl.drawWomen();
		
		PersonFactory factory3 = new HNFactory();
		Boy boy=factory3.getBoy();
		boy.drawMan();
	}

}
