package template_method;
//模板模式
public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("加入糖和牛奶");
	}

	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}
	
	//不加调味(通过复写，选择挂在钩子上)
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}
}
