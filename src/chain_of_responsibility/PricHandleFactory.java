package chain_of_responsibility;

public class PricHandleFactory {

	//创建PricHandle的工厂方法(注意返回值)
		public static PricHandle createPricHandle() {
			PricHandle sales = new Sales();
			PricHandle man = new Manager();
			PricHandle dir = new Director();
			PricHandle vp = new VicePresident();
			PricHandle ceo = new CEO();
			
			//添加后继节点
			sales.setSuccessor(man);
			man.setSuccessor(dir);
			dir.setSuccessor(vp);
			vp.setSuccessor(ceo);
			
	/*		//？因为后继改了又改，最后变为了vp
			sales.setSuccessor(man);
			sales.setSuccessor(dir);
			sales.setSuccessor(vp);
			vp.setSuccessor(ceo);*/
			
			return sales;
			
		}

}
