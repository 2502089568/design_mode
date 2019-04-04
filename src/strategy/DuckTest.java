package strategy;

public class DuckTest {

	public static void main(String[] args) { 
		//Duck duck = new MallardDuck();
		Duck duck = new RubberDuck();
		duck.display();
		duck.quack();
		duck.fly();
	}

}
