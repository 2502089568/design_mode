package strategy;
//鸭子类(显示和鸣叫)
//在构造方法中用super.setFlyingStragrty(new 继承飞行策略接口的类());
//进行策略选择，选择鸭子飞行模式
public abstract class Duck {
	
	//组合
	private FlyingStragety flyingStragety;
	public FlyingStragety setFlyingStragrty(FlyingStragety flyingStragety) {
		return this.flyingStragety=flyingStragety;
	}
	
	public void fly() {
		flyingStragety.performFly();
	}
	
	public void quack() {
		System.out.println("嘎嘎嘎");
	}
	//鸭子外观不同
	public abstract void display();
}
