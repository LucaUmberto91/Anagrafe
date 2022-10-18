package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Countries;
import com.exercise01.model.People;

public interface PeopleRepo extends CrudRepository<People, Integer>{

	public Countries findById(int id);
	public Iterable<People> findAllBySurname (String surname);
}
