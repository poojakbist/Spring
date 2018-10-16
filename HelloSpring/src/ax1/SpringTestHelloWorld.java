package ax1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // here we are running jUnit in Spring
@ContextConfiguration(locations = { "classpath:annotated.xml" })
public class SpringTestHelloWorld {
	
	/*@Autowired
	private ApplicationContext ctx;*/

	@Autowired
	private HelloWorld hw;
	
	@Test
	public void testCase() {
		//HelloWorld hw = (HelloWorld) ctx.getBean("hi");
		System.out.println(hw.getName());
	}
}
