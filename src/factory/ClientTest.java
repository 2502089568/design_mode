package factory;
/*发型为静态工厂模式
 * 男女为抽象工厂模式
 * 用来管理有多个类似的类，并需要实例化出来多个类的情况
 * 之后把工厂的类都放到一根文件夹里面吧
 * */
public class ClientTest {

	public static void main(String[] args) {
		//显式生成发型，不方便每次生成都要在客户端调用，且不好管理
		//Hair left = new LeftHair();
		//left.draw();
		
		//工厂模式实现1
		HairFactory factory =new HairFactory();
		//Hair left = factory.getHair("left");
		//left.draw();
		//工厂模式实现2(用反射找到类名，使不必每次加了类都要加到工厂类里面)
		//Hair left = factory.getHairByClass("factory.LeftHair");//包名+类名
		Hair left = factory.getHairByClass(InHair.class.getName());//或者这样调用直接得到类的路径
		left.draw();
		
		//抽象工厂
		PersonFactory factory2 = new MCFctory();
		Girl girl=factory2.getGirl();
		girl.drawWomen();
		
		PersonFactory factory3 = new HNFactory();
		Boy boy=factory3.getBoy();
		boy.drawMan();
	}

}
