package strategy;

public class RedheadDuck extends Duck {

	
	public RedheadDuck() {
		super();
		super.setFlyingStragrty(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
