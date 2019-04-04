package factory;
//发型工厂
//帮我们生成发型，使我们不用在客户端显示调用发型到时候改就在这改就可以了
public class HairFactory {
	
	//根据类型生成发型（但是这样每次加新发型都要加else if）
	public Hair getHair(String key) {
		if("left".equals(key)) {
			return new LeftHair();
		}else if("right".equals(key)) {
			return new RightHair();
		}else {
			return null;
		}
		
	}
	
	//根据类的名称生产对象
	//反射：根据类的名称创建对象，实例
	//增加发型的话就直接加发型的类就行了
	public Hair getHairByClass(String className) {
		try {
			Hair hair =(Hair) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//反射
		return null;
	}
}
