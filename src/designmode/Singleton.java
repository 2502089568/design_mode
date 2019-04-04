package designmode;
/*一些对象只能有一个
 * 私有构造方法（不让外部直接创建对像）
 * *饿汉模式*在加载类的时候比较慢，但运行时获取对象比较快，线程安全
 * *懒汉模式*在加载类的时候比较快，但运行时获取对象比较慢，线程不安全
 * */
public class Singleton {
	private Singleton() {}
	
/*  //*饿汉模式*（有static）（类被加载的时候实例就会被加载）
	//创建类唯一实例没 private的话外部直接Singleton.instance即可获得	
	private static Singleton instance = new Singleton(); 
	
	public static Singleton getInstance() {
		return instance;
	}*/
	
/*	//*懒汉模式*(创建实例的时候不new对象，在get中new)
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();  
		}
		return instance;
	}*/
}
