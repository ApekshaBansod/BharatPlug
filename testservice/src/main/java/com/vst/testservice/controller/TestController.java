package com.vst.testservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value = "/test")
	public ResponseEntity<String> test() {
		
		return new ResponseEntity<String>("<h1>Hii Ashutosh, this is test api...!</h1>", HttpStatus.OK);		
		
	}
	
}
