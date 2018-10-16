package ax2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
    public void testProvider() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("annotated.xml");
		
		//Calling beans from Provider
		MessageProvider mp = (MessageProvider) appCtx.getBean("provider");
		
		mp.process("sms", "9820108880", "Hello Shal");
		mp.process("email", "shal@in", "Hola PR");
		mp.process("whatsapp", "shal@gdfgin", "Hola PR");
	}
}
