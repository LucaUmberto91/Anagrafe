package com.exercise01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "peopleClass")
@Table(name = "people")
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "idRecord")
	private int idRecord;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "country")
	private String country;
	private String edu;
	
	@Column(name = "sex")
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
	
	public People(Integer age, String country, String sex, String name, String surname) {
		super();
		this.age = age;
		this.country = country;
		this.name = name;
		this.sex = sex;
		this.surname = surname;
	}
	public People(Integer age, String country, String edu, String sex,String name,String surname,int idRecord) {
		super();
		this.age = age;
		this.country = country;
		this.edu = edu;
		this.sex = sex;
		this.name = name;
		this.surname = surname;
		this.idRecord = idRecord;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getIdRecord() {
		return idRecord;
	}
	public void setIdRecord(int idRecord) {
		this.idRecord = idRecord;
	}
	public People() {
		super();
	}
	public People(int age2, String name2, String name3, String name4, String name5, String surname2, Integer id2) {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
