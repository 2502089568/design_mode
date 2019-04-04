package strategy;

public class FlyNoWay implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("我不会飞，只会游");
	}

}
