package adapter;
//Í¨¹ı¼Ì³ĞÊµÏÖÊÊÅä
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		System.out.println("½èÖú¼Ì³ĞÊÊÅäÆ÷");
		this.powerWithTwo();
	}

}
