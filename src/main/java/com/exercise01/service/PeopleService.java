package com.exercise01.service;

import com.exercise01.model.People;
import com.exercise01.model.Records;

public interface PeopleService {

	public People getPeopleImpl(Records record,String name, String surname);
	public Iterable<People> getPeopleImpl();
	public Iterable<People> getPeopleImpl(String surname);
	public People getPeopleImpl(Records record);
	public People getPeopleImpl(String name, String surname,String sex,String country, Integer age);
}
