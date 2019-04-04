package chain_of_responsibility;

public abstract class PricHandle {
	
	//ֱ�Ӻ�̣����ڴ�������
	protected PricHandle successor;

	public abstract void processDiscount(float discount); 
	
	public void setSuccessor(PricHandle successor) {
		this.successor = successor;
	}
}
