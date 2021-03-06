package io.rive.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return String.format("%s %s %s",  "Hello ", "<b>"+name+"</b>" , ", you are welcome!");		
	}

}