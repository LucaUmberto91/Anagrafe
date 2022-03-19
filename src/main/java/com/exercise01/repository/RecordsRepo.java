package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Records;

public interface RecordsRepo extends CrudRepository<Records, Integer>{

	public Records findById(int id);
	public Iterable<Records> findAll();
	public Iterable<Records> findAllById(int id);
}
