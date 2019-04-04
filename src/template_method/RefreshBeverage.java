package template_method;
/*模板模式
 * 抽象基类，为所有子类提供一个算法框架
 * */
					//刷新       饮料
public abstract class RefreshBeverage {

	/*制作饮料的模板方法
	 * 封装了所有子类共同遵循的算法框架
	 * */             //准备   饮料         模板
	public final void prepareBeverageTemplate() {
		//1.将水煮沸
		boilWater();
		//2.泡制饮料
		brew();
		//3.将饮料放入杯中
		pourInCup();
		if(isCustomerWantsCondiments()) {
			//4.加入调料
			addCondiments();
		}	
	}

	//询问用户是否加调料
	//hook钩子函数提供默认或空实现
	//具体子类可自行决定是否挂钩和如何挂钩
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	//将不同的实现用抽象方法
	protected abstract void addCondiments();

	private void pourInCup() {
		//相同的方法用私有
		System.out.println("将饮料倒入杯中");
	}

	//将不同的实现用抽象方法
	protected abstract void brew();

	private void boilWater() {
		//相同的方法用私有
		System.out.println("将水煮沸");
		
	}
}
