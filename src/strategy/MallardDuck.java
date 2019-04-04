package strategy;

public class MallardDuck extends Duck {

	
	
	public MallardDuck() {
		super();
		super.setFlyingStragrty(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}
