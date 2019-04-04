package adapter;
//在三相抽头接口的方法里面调用二相抽头的方法（传入的是二相插头）
import javax.management.loading.PrivateClassLoader;

public class TwoPlugAdapter implements ThreePlugIf {

	private GBTwoPlug plug; 
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug=plug;
	}
	
	@Override
	public void powerWithThree() {
		System.out.println("通过转化");
		plug.powerWithTwo();

	}

}
