package chain_of_responsibility;

public abstract class PricHandle {
	
	//直接后继，用于传递请求
	protected PricHandle successor;

	public abstract void processDiscount(float discount); 
	
	public void setSuccessor(PricHandle successor) {
		this.successor = successor;
	}
}
