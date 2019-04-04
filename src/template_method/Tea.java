package template_method;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");

	}

	@Override
	protected void brew() {
		System.out.println("用沸水泡茶");

	}

}
