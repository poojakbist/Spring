package ax1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	@Test
	public void testGreeting() {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("annotated.xml");
		
		//By ID
		HelloWorld hw = (HelloWorld) appCtx.getBean("hi");
		System.out.println(hw.getName());
	
		//By Class Name
		HelloWorld hw2 = appCtx.getBean(HelloWorld.class );
		System.out.println(hw2.getName());
	
	}
}
