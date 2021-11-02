package springcorecodecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcode {

	public static void main(String[] args) {
		System.out.println("Fetching data with property dependecy for Collection type pf data.....");
		ApplicationContext Ac = new ClassPathXmlApplicationContext("springcorecodecollection/collectionconfig.xml");
		Question data = (Question) Ac.getBean("collectioncheck");
		System.out.println(data);
	}

}
