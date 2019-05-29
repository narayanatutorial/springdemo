package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class SpringControler {

	@RequestMapping("/status")
	public String getStatus() {
		return "Working";
	}
}
