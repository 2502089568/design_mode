package chain_of_responsibility;

public class CEO extends PricHandle {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.55) {
			System.out.format("%s�ܾ���׼�ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else {
			System.out.format("%s�ܾ���׼�ۿ�:%.2f%n",this.getClass().getName(),discount);
		}
	}

}
