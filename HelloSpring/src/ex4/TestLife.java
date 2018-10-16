package ex4;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	@Test
	public void lafda() {
		// only ConfigurableApplicationContext can be closed
		ConfigurableApplicationContext kuchBhi = new ClassPathXmlApplicationContext("ex4/appctx.xml");
				
		MyLife dukh = kuchBhi.getBean(MyLife.class);
		
		
		kuchBhi.close(); //on commenting, we cannot see the destroy method
	}
}
