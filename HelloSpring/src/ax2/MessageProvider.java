package ax2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("provider")
public class MessageProvider implements ApplicationContextAware {
	private ApplicationContext ctx;

	
	// to get reference to the existing container, we declare a local var ctx and pass it in below function
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;

	}

	public void process(String type, String to, String msg) {
		MessageService ms = (MessageService) ctx.getBean(type);  // getBean basically is like getMethod
		ms.send(to, msg);
	}

}
