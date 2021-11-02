package springcorelifecycleusingxml;

public class Shopkeeper {

	private int totalAmount;

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Shopkeeper(int totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}

	public Shopkeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shopkeeper [totalAmount=" + totalAmount + "]";
	}
	
	public void fff()//init
	{
		System.out.println("Hey this init method is about to start...");
	}
	public void ddd() //destroy
	{
		System.out.println("Hey this destroy method is about to end...");	
	}
	
}
