package springcoreseterotype.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Testsetereo {

	public static void main(String[] args) {
		ApplicationContext Ac = new ClassPathXmlApplicationContext("springcoreseterotype/Annotation/stereoannotation.xml");
		Student data= Ac.getBean("student",Student.class);
		System.out.println(data);
	}

}
