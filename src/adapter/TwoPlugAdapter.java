package adapter;
//�������ͷ�ӿڵķ���������ö����ͷ�ķ�����������Ƕ����ͷ��
import javax.management.loading.PrivateClassLoader;

public class TwoPlugAdapter implements ThreePlugIf {

	private GBTwoPlug plug; 
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug=plug;
	}
	
	@Override
	public void powerWithThree() {
		System.out.println("ͨ��ת��");
		plug.powerWithTwo();

	}

}
