package chain_of_responsibility;

public class Manager extends PricHandle {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.3) {
			System.out.format("%sÅú×¼ÕÛ¿Û:%.2f%n",this.getClass().getName(),discount);
		}else {
			successor.processDiscount(discount);
		}

	}

}
