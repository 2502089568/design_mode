package chain_of_responsibility;

public class Director extends PricHandle {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.4) {
			System.out.format("%s��׼�ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else {
			successor.processDiscount(discount);
		}

	}

}
