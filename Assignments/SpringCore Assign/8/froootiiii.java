package SpringcoreimplementationcyclethroughInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class froootiiii implements InitializingBean, DisposableBean {
	
	private int rate;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public froootiiii(int rate) {
		super();
		this.rate = rate;
	}

	public froootiiii() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "froootiiii [rate=" + rate + "]";
	}
//	void init()
//	{
//		System.out.println("intit is running");
//	}
//	void destroy()
//	{
//	System.out.println("Destroying is working");	
//	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hey this is destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hey this is invoking method");
		
	}
	

}
