package com.sts.rest;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/j")
	public String getData() {
		
		return"jenkins build sucess";
	}
	
}
