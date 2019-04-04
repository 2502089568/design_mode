package chain_of_responsibility;

public class Sales extends PricHandle {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.05) {
			System.out.format("%s��׼�ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else {
			successor.processDiscount(discount);
		}

	}

}
