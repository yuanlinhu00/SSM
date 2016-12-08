package com.lh.ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lh.ssm.entity.Person;
import com.lh.ssm.service.IPersonService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class SSMTest {

	@Autowired
	private IPersonService personService;
	
	@Test
	public void mybatisTest() {
		int id = 1;
		Person person = personService.findById(id);
		System.out.println(person.toString());
	}
}
