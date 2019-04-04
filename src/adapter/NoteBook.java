package adapter;
//二相电流三相插头
//即适配类就是一个继承了目标的接口的类在目标接口的方法中使用待适配的方法
//（相当于待适配的方法外面包了一层目标方法的皮）
public class NoteBook {

	private static ThreePlugIf plug;
	
	public NoteBook(ThreePlugIf plug) {
		this.plug=plug;
	}
	
	
	//插座充电
	public void charge() {
		plug.powerWithThree();
	}
	public static void main(String[] args) {
		GBTwoPlug two = new GBTwoPlug();
		ThreePlugIf three = new TwoPlugAdapter(two);
		NoteBook nb =new NoteBook(three);
		nb.charge();
		
		three = new TwoPlugAdapterExtends();
		nb=new NoteBook(three);
		nb.charge();
		}

}
