package springcorelifecycleusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testxml {

	public static void main(String[] args) {
		
		AbstractApplicationContext As= new ClassPathXmlApplicationContext("springcorelifecycleusingxml/lyfecyclexml.xml");
		As.registerShutdownHook();
		Shopkeeper sk= As.getBean("shopkeeper",Shopkeeper.class);
		System.out.println(sk);
	
	}
}
