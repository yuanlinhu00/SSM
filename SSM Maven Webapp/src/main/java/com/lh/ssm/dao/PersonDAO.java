package com.lh.ssm.dao;

import org.springframework.stereotype.Repository;

import com.lh.ssm.entity.Person;

@Repository
public interface PersonDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}