package chain_of_responsibility;

import java.util.Random;

//客户申请折扣
//只关心结果，不关心谁处理的
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
