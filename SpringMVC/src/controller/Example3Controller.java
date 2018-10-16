package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example3Controller {

	@RequestMapping("/example3.do")
	//pass by reference by default in java
	public String doSomething(Map model) {//as its pass by reference, all changes are reflected
		model.put("message", "Welcome to Spring MVC");
		return "example1";
	}
}
