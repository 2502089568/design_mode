package template_method;

public class Test {

	public static void main(String[] args) {
		System.out.println("�Ʊ�����");
		RefreshBeverage b1 = new Coffee();
		//RefreshBeverage b1 = new Tea();
		b1.prepareBeverageTemplate();
		System.out.println("�����Ʊ����");

	}

}
