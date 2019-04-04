package template_method;

public class Test {

	public static void main(String[] args) {
		System.out.println("制备咖啡");
		RefreshBeverage b1 = new Coffee();
		//RefreshBeverage b1 = new Tea();
		b1.prepareBeverageTemplate();
		System.out.println("咖啡制备完毕");

	}

}
