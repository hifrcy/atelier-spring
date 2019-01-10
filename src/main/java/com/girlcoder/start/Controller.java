package com.girlcoder.start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/wilders")
	public String getWilders() {
		return "Tony, Mohamed, Nicolas, et Tantely";
	}
	
	@RequestMapping("/wilders/women")
	public String getWomenWilders() {
		return "Tantely";
	}

}
