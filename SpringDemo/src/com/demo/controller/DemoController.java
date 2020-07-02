package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/" )
public class DemoController {
	   public String helloTest() {
	      return "Hello World";
	   }
}
