package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/simple")
public class SimpleController {

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		
		return "simple";
	}
	
	
	
	/*
	 * //위에 코드와 동일한데 어노테이션만 추가했음.
	 * 
	 * @RequestMapping(method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String simple() {
	 * 
	 * return "simple1234"; }
	 */
	
	//위에 코드와 동일한데 어노테이션만 추가했음.
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String simple(@RequestBody String body) {
		
		return body;
	}
	
	
}
