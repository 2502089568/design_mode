package template_method;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("��������");

	}

	@Override
	protected void brew() {
		System.out.println("�÷�ˮ�ݲ�");

	}

}
