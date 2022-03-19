package com.exercise01.service;

import com.exercise01.model.People;
import com.exercise01.model.Records;

public interface PeopleService {

	public People getPeopleImpl(Records record,String name, String surname);
	public People getPeopleImpl(Records record);
}
