package chain_of_responsibility;

public class Sales extends PricHandle {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.05) {
			System.out.format("%sÅú×¼ÕÛ¿Û:%.2f%n",this.getClass().getName(),discount);
		}else {
			successor.processDiscount(discount);
		}

	}

}
