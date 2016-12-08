package com.lh.ssm.entity;

import java.util.Date;

import com.lh.ssm.entity.base.BaseEntity;


public class Person extends BaseEntity{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -4555673913129918585L;

	private Integer id;

    private String name;

    private Integer gender;

    private String address;
    
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Override
   	public String toString() {
   		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", birthday="
   				+ birthday + "]";
   	}
}