package strategy;

public class RubberDuck extends Duck {


	public RubberDuck() {
		super();
		super.setFlyingStragrty(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我全身发黄");
	}

}
