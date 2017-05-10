package io.myspringproject.springbootstarter.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHelloWorld(){
		return "HelloWorld";
	}
}
