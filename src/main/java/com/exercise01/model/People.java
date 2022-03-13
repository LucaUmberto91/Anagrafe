package com.exercise01.model;

public class People {
	
	private Integer age;
	private String country;
	private String edu;
	private String sex;
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public People(Integer age, String country, String edu, String sex) {
		super();
		this.age = age;
		this.country = country;
		this.edu = edu;
		this.sex = sex;
	}
	
	
	

}
