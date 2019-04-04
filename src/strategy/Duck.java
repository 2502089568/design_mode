package strategy;
//Ѽ����(��ʾ������)
//�ڹ��췽������super.setFlyingStragrty(new �̳з��в��Խӿڵ���());
//���в���ѡ��ѡ��Ѽ�ӷ���ģʽ
public abstract class Duck {
	
	//���
	private FlyingStragety flyingStragety;
	public FlyingStragety setFlyingStragrty(FlyingStragety flyingStragety) {
		return this.flyingStragety=flyingStragety;
	}
	
	public void fly() {
		flyingStragety.performFly();
	}
	
	public void quack() {
		System.out.println("�¸¸�");
	}
	//Ѽ����۲�ͬ
	public abstract void display();
}
