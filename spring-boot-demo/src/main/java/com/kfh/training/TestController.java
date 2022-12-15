package com.kfh.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

	@RequestMapping("/greeting")
	String getGreeting() {
		return "Hello, how are you?";
	}
	
	@RequestMapping("/arabic")
	String getGreetingInArabic() {
		return "Marhaban, Kaifa halak";
	}
}
