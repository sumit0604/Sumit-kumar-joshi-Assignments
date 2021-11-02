package springcorecodeassign1A;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcode {

	public static void main(String[] args) {
		System.out.println("Fetching info from beans......properties injection\n");
		
		ApplicationContext Ac = new ClassPathXmlApplicationContext("springcorecodeassign1A/firstconfig.xml");
		Customer data= (Customer) Ac.getBean("customerref");
		System.out.println(data);
		

	}

}
