package springcoreapplicationcontextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaware {

	public static void main(String[] args) {
		AbstractApplicationContext Ac= new ClassPathXmlApplicationContext("springcoreapplicationcontextaware/contextawareconfig.xml");
		applicationaware appcontext= Ac.getBean("appcontext",applicationaware.class);
		ApplicationContext appdata =appcontext.getContext();
		force fa= appdata.getBean("force",force.class);
		fa.define();
		Ac.registerShutdownHook();
		
	}

}
