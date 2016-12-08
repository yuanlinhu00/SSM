package com.lh.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.ssm.dao.PersonDAO;
import com.lh.ssm.entity.Person;
import com.lh.ssm.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private PersonDAO personDAO;
	
	public Person findById(Integer id) {
		return personDAO.selectByPrimaryKey(id);
	}

}
