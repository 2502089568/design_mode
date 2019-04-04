package chain_of_responsibility;

import java.util.Random;

//�ͻ������ۿ�
//ֻ���Ľ����������˭�����
public class Customer {
	
	private PricHandle pricHandle;
	
	public void setPricHandle(PricHandle pricHandle) {
		this.pricHandle = pricHandle;
	}

	public void requestDiscount(float discount) {
		pricHandle.processDiscount(discount);
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPricHandle(PricHandleFactory.createPricHandle());
		
		Random random = new Random();
		for(int i=1;i<=100;i++) {
			System.out.print(i+":");
			customer.requestDiscount(random.nextFloat());
		}
	}
}
