package template_method;
//ģ��ģʽ
public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("�����Ǻ�ţ��");
	}

	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}
	
	//���ӵ�ζ(ͨ����д��ѡ����ڹ�����)
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}
}
