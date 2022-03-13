package com.exercise01.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "archiveClass")
@Table(name = "archive")
public class Archive {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@Transient
	private List<Records> peopleList;


	public List<Records> getPeopleList() {
		return peopleList;
	}

	public void setPeopleList(List<Records> peopleList) {
		this.peopleList = peopleList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
