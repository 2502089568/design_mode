package adapter;
//ͨ���̳�ʵ������
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		System.out.println("�����̳�������");
		this.powerWithTwo();
	}

}
