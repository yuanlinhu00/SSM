package com.lh.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lh.ssm.entity.Person;
import com.lh.ssm.service.IPersonService;

@Controller
public class PersonController {

	private static Logger LOGGER = Logger.getLogger(PersonController.class);
	
	@Autowired
	private IPersonService personService;
	
	@ResponseBody
	@RequestMapping(value="/person/findById.do", method=RequestMethod.POST)	
	public Person findById(int id) {
		Person person = personService.findById(id);
		return person;
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	private String hello() {
		System.out.println("hello");
		return "hello";
	}
}
