package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.People;

public interface PeopleRepo extends CrudRepository<People, Integer>{

	public People findById(int id);
	public Iterable<People> findAll();
}
