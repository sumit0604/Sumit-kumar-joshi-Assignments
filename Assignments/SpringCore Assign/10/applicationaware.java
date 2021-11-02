package springcoreapplicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class applicationaware implements ApplicationContextAware {
		
		ApplicationContext context;
		public ApplicationContext getContext()
		{
			return context;
			
		}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.context =context;
	}

}
