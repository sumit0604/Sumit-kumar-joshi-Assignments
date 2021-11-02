package SpringcoreimplementationcyclethroughInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testinterface {

	public static void main(String[] args) {
		AbstractApplicationContext Ac = new ClassPathXmlApplicationContext("SpringcoreimplementationcyclethroughInterface/lyfecycleinteface.xml");
		Ac.registerShutdownHook();
		froootiiii fc = (froootiiii) Ac.getBean("fruitirate");
		System.out.println(fc);
	}

}
