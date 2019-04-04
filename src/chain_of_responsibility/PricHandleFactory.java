package chain_of_responsibility;

public class PricHandleFactory {

	//����PricHandle�Ĺ�������(ע�ⷵ��ֵ)
		public static PricHandle createPricHandle() {
			PricHandle sales = new Sales();
			PricHandle man = new Manager();
			PricHandle dir = new Director();
			PricHandle vp = new VicePresident();
			PricHandle ceo = new CEO();
			
			//��Ӻ�̽ڵ�
			sales.setSuccessor(man);
			man.setSuccessor(dir);
			dir.setSuccessor(vp);
			vp.setSuccessor(ceo);
			
	/*		//����Ϊ��̸����ָģ�����Ϊ��vp
			sales.setSuccessor(man);
			sales.setSuccessor(dir);
			sales.setSuccessor(vp);
			vp.setSuccessor(ceo);*/
			
			return sales;
			
		}

}
